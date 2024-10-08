package X;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class FR7 implements C20872X1y {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ C18550Vu2 A02;
    public final /* synthetic */ 2cW A03;
    public final /* synthetic */ AnonymousClass4VR A04;
    public final /* synthetic */ String A05;

    public FR7(Context context, PreferenceScreen preferenceScreen, C18550Vu2 vu2, 2cW r4, AnonymousClass4VR r5, String str) {
        this.A02 = vu2;
        this.A05 = str;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = preferenceScreen;
        this.A00 = context;
    }

    public final boolean DYi(Preference preference) {
        List<AnonymousClass4VV> list;
        String str;
        Object[] objArr;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        String str5;
        String str6;
        Boolean bool2;
        String str7;
        String str8;
        String A06;
        C18550Vu2 vu2 = this.A02;
        String str9 = this.A05;
        AnonymousClass4VR r1 = this.A04;
        IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = this.A03;
        PreferenceScreen preferenceScreen = this.A01;
        Context context = this.A00;
        Context context2 = context;
        C18080Vl9 vl9 = new C18080Vl9(context);
        AnonymousClass4VQ r6 = (AnonymousClass4VQ) r1;
        AnonymousClass4UC r0 = r6.A01;
        vl9.A08(002.A0T(r0.A0D, iGDevToolPersistentStateHandler.B7L(r0.A0D), ' '));
        StringBuilder sb = new StringBuilder("[\n");
        AnonymousClass4VT r4 = r6.A02;
        if (r4 != null) {
            list = r4.A00.A02;
        } else {
            list = 0sn.A00;
        }
        for (AnonymousClass4VV r9 : list) {
            sb.append(StringFormatUtil.formatStrLocaleSafe("{type: %s, value: %s}\n", new Object[]{r9.A00.A00.name(), r9.A01}));
        }
        sb.append("]");
        AnonymousClass5IN Ar7 = iGDevToolPersistentStateHandler.Ar7(r1, str9);
        if (Ar7.A07) {
            AnonymousClass5IN AYQ = iGDevToolPersistentStateHandler.AYQ(r1, str9);
            if (!AYQ.A07) {
                Integer num = AYQ.A03;
                if (num != null) {
                    objArr = new Object[]{C48306EcP.A00(num)};
                    str2 = "false.\nFailed Counter: %s";
                    str = StringFormatUtil.formatStrLocaleSafe(str2, objArr);
                }
                str = "false";
            } else if (r0.A0I) {
                str = "false. Is in exposure holdout.";
            } else {
                str = "true";
            }
        } else {
            AnonymousClass4VV r92 = Ar7.A01;
            if (r92 != null) {
                objArr = new Object[]{r92.A00.A00, r92.A01};
                str2 = "false.\nFailed filter: %s, value: %s";
                str = StringFormatUtil.formatStrLocaleSafe(str2, objArr);
            } else {
                AnonymousClass4VU r10 = Ar7.A02;
                if (r10 != null) {
                    IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler2 = iGDevToolPersistentStateHandler;
                    C232122sx r93 = new C232122sx();
                    Set CA0 = r0.CA0();
                    Context context3 = iGDevToolPersistentStateHandler2.A00;
                    2c5 r17 = (2c5) 2c5.A03.getValue();
                    Context context4 = context3;
                    AnonymousClass426 A002 = r17.A00(context4, iGDevToolPersistentStateHandler2.A01, new 2cX(), str9, CA0);
                    0qQ.A0C(A002, "null cannot be cast to non-null type com.facebook.quickpromotion.sdk.eligibility.QPEligibilityContext<com.instagram.quickpromotion.intf.Trigger, com.facebook.quickpromotion.sdk.models.QuickPromotion<com.instagram.quickpromotion.intf.Trigger>>");
                    HashMap A012 = r93.A01(r1, A002, r10);
                    StringBuilder sb2 = new StringBuilder("false.\nFailed filter clause. Contextual Filter Results:\n");
                    Iterator A0s = AnonymousClass7TF.A0s(A012);
                    while (A0s.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                        AnonymousClass4VV r11 = (AnonymousClass4VV) A1J.getKey();
                        sb2.append(StringFormatUtil.formatStrLocaleSafe("result: %b, filter: %s, value: %s \n", new Object[]{A1J.getValue(), r11.A00.A00.name(), r11.A01}));
                    }
                    str = sb2.toString();
                }
                str = "false";
            }
        }
        String C7n = iGDevToolPersistentStateHandler.C7n(r1);
        String AqU = iGDevToolPersistentStateHandler.AqU(r1);
        Integer valueOf = Integer.valueOf(r0.A00);
        Integer valueOf2 = Integer.valueOf(iGDevToolPersistentStateHandler.Arc(r1, AnonymousClass05K.A00, str9));
        AnonymousClass4VG r42 = r0.A08.A01;
        if (r42 == null || (str3 = Integer.valueOf(DbX.A02(r42.A01)).toString()) == null) {
            str3 = "null";
        }
        if (r42 == null || (str4 = r42.A03) == null) {
            str4 = "null";
        }
        if (r42 != null) {
            bool = Boolean.valueOf(r42.A04);
        } else {
            bool = null;
        }
        Integer valueOf3 = Integer.valueOf(iGDevToolPersistentStateHandler.Arc(r1, AnonymousClass05K.A01, str9));
        AnonymousClass4VG r43 = r0.A08.A02;
        if (r43 == null || (str5 = Integer.valueOf(DbX.A02(r43.A01)).toString()) == null) {
            str5 = "null";
        }
        if (r43 == null || (str6 = r43.A03) == null) {
            str6 = "null";
        }
        if (r43 != null) {
            bool2 = Boolean.valueOf(r43.A04);
        } else {
            bool2 = null;
        }
        Integer valueOf4 = Integer.valueOf(iGDevToolPersistentStateHandler.Arc(r1, AnonymousClass05K.A0C, str9));
        AnonymousClass4VG r44 = r0.A08.A00;
        if (r44 == null || (str7 = Integer.valueOf(DbX.A02(r44.A01)).toString()) == null) {
            str7 = "null";
        }
        Integer valueOf5 = Integer.valueOf(iGDevToolPersistentStateHandler.Arc(r1, AnonymousClass05K.A0N, str9));
        Long valueOf6 = Long.valueOf(r6.A00);
        C283885Js r45 = r0.A08.A08;
        if (r45 == null || (str8 = r45.A00) == null) {
            str8 = "null";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(",");
        A1A.append(r0.CA0());
        C283905Ju r46 = r0.A08.A07;
        if (r46 == null) {
            A06 = "null";
        } else {
            Integer num2 = r46.A01;
            if (num2 == null) {
                num2 = C283905Ju.A05;
                0qQ.A08(num2);
            }
            Integer valueOf7 = Integer.valueOf(num2.intValue());
            Integer num3 = r46.A02;
            if (num3 == null) {
                num3 = C283905Ju.A05;
                0qQ.A08(num3);
            }
            A06 = 0mp.A06("{\n height: %d,\n width %d,\n scale: %f,\n name: %s,\n url: %s\n}", new Object[]{valueOf7, Integer.valueOf(num3.intValue()), r46.A04, "", r46.A00});
        }
        StringBuilder A0n = AnonymousClass7TF.A0n(",");
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r0.A0H) {
            A1C.add(C48079EUx.BYPASS_SURFACE_DELAY);
        }
        if (r0.A0K) {
            A1C.add(C48079EUx.IS_UNCANCELABLE);
        }
        A0n.append(A1C);
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Title: %s\n\nContent: %s\n\nMax Impressions: %s\nLocal Impressions: %s\n\nPrimary Action\nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nSecondary Action\nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nDismiss Action\nLimit: %s\nLocal Count: %s\n\nHas Native Template: %s\n\nHas Bloks: %s\n\nImpression Delay Met: %s\nDismiss Delay Met: %s\n\nPriority: %s\n\nSocial Context:%s\n\nEligible?: %s\n\nTriggers: %s\n\nFilters: %s\n\nImage: %s\n\nAttributes: %s", new Object[]{C7n, AqU, valueOf, valueOf2, str3, str4, bool, valueOf3, str5, str6, bool2, valueOf4, str7, valueOf5, "N", "N", true, 1, valueOf6, str8, str, A1A, sb, A06, A0n});
        C17742VdB vdB = vl9.A01;
        vdB.A0C = formatStrLocaleSafe;
        vl9.A06(new C49999FIk(context2, iGDevToolPersistentStateHandler, r1, vu2, str9, 0), "Reset Counters");
        vl9.A05(new W5R(1, (Object) context2, (Object) r1, (Object) vu2), "JSON");
        FIh fIh = new FIh(0, context2, r1, iGDevToolPersistentStateHandler, preferenceScreen, vu2);
        vdB.A0E = "Force Mode Options";
        vdB.A02 = fIh;
        AnonymousClass0fN.A00(vl9.A00());
        return true;
    }
}
