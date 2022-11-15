package lotto.domain;

import java.util.Arrays;

public enum LottoRank {
    LOSE(0, false, 0, ""),
    FIFTH(3, false, 5_000, "3개 일치 (5,000원)"),
    FOURTH(4, false, 50_000, "4개 일치 (50,000원)"),
    THIRD(5, false, 1_500_000, "5개 일치 (1,500,000원)"),
    SECOND(5, true, 30_000_000, "5개 일치, 보너스 볼 일치 (30,000,000원)"),
    FIRST(6, false, 2_000_000_000, "6개 일치 (2,000,000,000원)");

    private final int winningNumberCount;
    private final boolean hasBonusNumber;
    private final int prizeMoney;
    private final String description;

    LottoRank(int winningNumberCount, boolean hasBonusNumber, int prizeMoney, String description) {
        this.winningNumberCount = winningNumberCount;
        this.hasBonusNumber = hasBonusNumber;
        this.prizeMoney = prizeMoney;
        this.description = description;
    }

    public boolean correctWinningNumberCount(int winningNumberCount) {
        return this.winningNumberCount == winningNumberCount;
    }
}
