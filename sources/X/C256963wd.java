package X;

/* renamed from: X.3wd  reason: invalid class name and case insensitive filesystem */
public enum C256963wd {
    SINGLE_FORMAT("sf"),
    NO_BANDWIDTH("nb"),
    NO_CURRENT("nc"),
    USE_CURRENT_FROM_PLAYER("uc"),
    USE_DEFAULT("ud"),
    FORCE_CURRENT("fc"),
    LOW_BUFFER("lb"),
    HIGH_BUFFER("hb"),
    LOW_BANDWIDTH("lbw"),
    HIGH_BANDWIDTH("hbw"),
    FORCE_CURRENT_WITH_VERY_HIGH_BUFFER("fchb"),
    TRY_LOWER_QUALITY("tlq"),
    TRY_HIGHER_QUALITY("thq"),
    HIGHER_QUALITY_MID_BUFFER("hqmb"),
    LOWER_QUALITY_CONF_BASED("lqcf"),
    HIGHER_QUALITY_CONF_BASED("hqcf"),
    ABR_UP_WATCHABLE("wat"),
    CAP_AT_HVQ("hvq"),
    USE_CACHED("cache"),
    DISCARD_CACHED("nocache"),
    PRESELECTED("ps"),
    PREFETCHING("pf"),
    SECOND_PHASE_ONLY("spo"),
    USE_LOWEST_WITH_NO_SUITABLE_FORMAT("ulsf"),
    BUFFER("buf"),
    CHOOSE_BASED_ON_BANDWIDTH("band"),
    AUDIO_PAIRING("pair"),
    CAUGHT_LIVE_HEAD("lh"),
    FORCE_LOWEST("fl"),
    FORCE_LOWEST_CURRENT("flc"),
    LOAD_INIT("li"),
    STATIC_DEFAULT("sd"),
    VERY_HIGH_BUFFER_BANDWIDTH_BOOST("vhbb"),
    SOFT_MOS("sm"),
    HIGH_RISK_REWARD_RATIO("rrr"),
    SYSTEMIC_RISK("sr"),
    LOW_MOS_RISK("lm"),
    MOD_MOS_RISK("mm"),
    LIVE_MAX_BITRATE_FIX("lmbf"),
    INTENTION_CHANGED("int"),
    SLOPE_BASED_RISK_REWARD("sbrr"),
    HIGH_OR_BETTER_MOS_OVERRIDE("hobmo"),
    RATIONAL_GAMBLER_QOE_ABR("rg_qoe");
    
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C256963wd[] r2;
        A01 = 0oU.A00(r2);
    }

    /* access modifiers changed from: public */
    C256963wd(String str) {
        this.A00 = str;
    }
}
