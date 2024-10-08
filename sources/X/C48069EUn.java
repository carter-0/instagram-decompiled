package X;

import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.EUn  reason: case insensitive filesystem */
public enum C48069EUn {
    AA_TEST_EXPERIMENT(A00(2021, 11, 1), new String[]{"control", "test", "test2"}, 3),
    NDX_FDID_HOLDOUT(A00(2022, 5, 1), new String[]{"control", "holdout"}, 4),
    IG4A_MULTIPLE_AR_FDID_BACKTEST(A00(2022, 3, 10), new String[]{"control", "test"}, 6);
    
    public final Date A00;
    public final Date A01;
    public final String[] A02;

    /* access modifiers changed from: public */
    static {
        new C48069EUn("PLACE_HOLDER_EXPERIMENT", A00(2021, 8, 17), A00(2021, 8, 27), new String[]{"control", "test"}, 0);
        new C48069EUn("TEST_EXPERIMENT", A00(2021, 8, 17), A00(2021, 11, 27), new String[]{"control", "test", "test2"}, 1);
        new C48069EUn("INTERNAL_SETTING_EXPERIMENT", A00(2020, 8, 17), A00(2050, 11, 27), new String[]{"control", "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9"}, 2);
        AA_TEST_EXPERIMENT = new C48069EUn("AA_TEST_EXPERIMENT", A00(2021, 9, 12), A00(2021, 11, 1), new String[]{"control", "test", "test2"}, 3);
        NDX_FDID_HOLDOUT = new C48069EUn("NDX_FDID_HOLDOUT", A00(2022, 1, 7), A00(2022, 5, 1), new String[]{"control", "holdout"}, 4);
        new C48069EUn("FB4A_FDID_OE_INTEGRATION_TEST_FDID", A00(2022, 1, 14), A00(2022, 3, 10), new String[]{"control", "backtest"}, 5);
        IG4A_MULTIPLE_AR_FDID_BACKTEST = new C48069EUn("IG4A_MULTIPLE_AR_FDID_BACKTEST", A00(2022, 1, 16), A00(2022, 3, 10), new String[]{"control", "test"}, 6);
        new C48069EUn("CAA_V1_FULL_TEST_TRIAGE_ANDROID", A00(2022, 8, 12), A00(2024, 1, 28), new String[]{"caa_oe_group_1", "caa_oe_group_2", "caa_oe_group_3", "caa_oe_group_4", "caa_oe_group_5", "caa_oe_group_6", "caa_oe_group_7", "caa_oe_group_8", "caa_oe_group_9", "caa_oe_group_10", "caa_switcher_universe_1", "caa_switcher_universe_2", "caa_switcher_universe_3", "caa_switcher_universe_4", "caa_switcher_universe_5", "caa_switcher_universe_6", "caa_switcher_universe_7"}, 7);
        new C48069EUn("CAA_LOGGED_OUT_PUSH_NOTIF_HOLDOUT", A00(2023, 4, 2), A00(2023, 7, 30), new String[]{"control", "holdout"}, 8);
    }

    public static Date A00(int i, int i2, int i3) {
        return new GregorianCalendar(i, i2, i3).getTime();
    }

    /* access modifiers changed from: public */
    C48069EUn(Date date, String[] strArr, int i) {
        this.A02 = strArr;
        this.A01 = r2;
        this.A00 = date;
    }
}
