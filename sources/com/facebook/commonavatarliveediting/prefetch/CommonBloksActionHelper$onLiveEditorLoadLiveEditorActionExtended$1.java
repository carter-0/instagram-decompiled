package com.facebook.commonavatarliveediting.prefetch;

import X.0KC;
import X.0eS;
import X.0rm;
import X.0sL;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass2Q8;
import X.AnonymousClass3EF;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C15046UKz;
import X.C16540Uwl;
import X.C18073Vl1;
import X.C262224Cq;
import X.C277014uI;
import X.C307896Rx;
import X.C53368Gms;
import X.C59703JUk;
import X.C60340gF;
import X.I3P;
import X.JVZ;
import X.LDN;
import X.UL7;
import X.W04;
import X.WF8;
import android.content.Context;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1", f = "CommonBloksActionHelper.kt", i = {0}, l = {433, 481}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ double A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UL7 A04;
    public final /* synthetic */ W04 A05;
    public final /* synthetic */ C18073Vl1 A06;
    public final /* synthetic */ LDN A07;
    public final /* synthetic */ C53368Gms A08;
    public final /* synthetic */ C307896Rx A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ Map A0D;
    public final /* synthetic */ 0rm A0E;
    public final /* synthetic */ 0rm A0F;
    public final /* synthetic */ C262224Cq A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;
    public final /* synthetic */ boolean A0J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(Context context, UL7 ul7, W04 w04, C18073Vl1 vl1, LDN ldn, C53368Gms gms, C307896Rx r9, String str, String str2, String str3, Map map, AnonymousClass4D7 r14, 0rm r15, 0rm r16, C262224Cq r17, double d, boolean z, boolean z2, boolean z3) {
        super(2, r14);
        this.A0E = r15;
        this.A0C = str;
        this.A0A = str2;
        this.A04 = ul7;
        this.A08 = gms;
        this.A0J = z;
        this.A05 = w04;
        this.A0G = r17;
        this.A06 = vl1;
        this.A0I = z2;
        this.A02 = d;
        this.A0F = r16;
        this.A09 = r9;
        this.A0D = map;
        this.A0B = str3;
        this.A0H = z3;
        this.A07 = ldn;
        this.A03 = context;
    }

    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r37) {
        0rm r19 = this.A0E;
        String str = this.A0C;
        String str2 = this.A0A;
        C53368Gms gms = this.A08;
        boolean z = this.A0J;
        W04 w04 = this.A05;
        C262224Cq r11 = this.A0G;
        C18073Vl1 vl1 = this.A06;
        boolean z2 = this.A0I;
        double d = this.A02;
        0rm r8 = this.A0F;
        C307896Rx r7 = this.A09;
        Map map = this.A0D;
        String str3 = this.A0B;
        boolean z3 = this.A0H;
        LDN ldn = this.A07;
        C53368Gms gms2 = gms;
        C307896Rx r21 = r7;
        String str4 = str;
        String str5 = str2;
        Context context = this.A03;
        W04 w042 = w04;
        C18073Vl1 vl12 = vl1;
        CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1 = new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1(context, this.A04, w042, vl12, ldn, gms2, r21, str4, str5, str3, map, r37, r19, r8, r11, d, z, z2, z3);
        commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1.A01 = obj;
        return commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4D7, com.facebook.commonavatarliveediting.prefetch.CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1] */
    public final Object invokeSuspend(Object obj) {
        C262224Cq r2;
        IllegalStateException illegalStateException;
        Object obj2 = obj;
        Object obj3 = 1Hj.A02;
        int i = this.A00;
        if (i == 0) {
            0eS.A00(obj2);
            r2 = (C262224Cq) this.A01;
            String str = (String) this.A0E.A00;
            String str2 = this.A0C;
            if (str2 != null) {
                String str3 = this.A0A;
                if (str3 != null) {
                    C15046UKz uKz = new C15046UKz(C16540Uwl.NORMAL_MODE, this.A04, this.A08, (Boolean) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, str2, str3, (String) null, (JSONObject) null, false, false, false, this.A0J, false, false);
                    W04 w04 = this.A05;
                    C262224Cq r5 = this.A0G;
                    C18073Vl1 vl1 = this.A06;
                    boolean z = this.A0I;
                    this.A01 = r2;
                    this.A00 = 1;
                    obj2 = w04.A02(uKz, vl1, this, r5, true, z);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            }
            throw illegalStateException;
        } else if (i != 1) {
            try {
                0eS.A00(obj2);
            } catch (AnonymousClass3EF e) {
                0KC.A0D("CommonBloksActionHelper", AnonymousClass7TG.A0m(e, "Timeout in executing LoadLiveEditor. Error: ", AnonymousClass7TE.A1A()));
                this.A06.A04("LOAD_ACTION_TIMEOUT", 3);
                W04.A01(this.A05, this.A09, (C277014uI) this.A0F.A00, "load_timeout");
            }
            return C60340gF.A00;
        } else {
            r2 = (C262224Cq) this.A01;
            0eS.A00(obj2);
        }
        Map map = this.A0D;
        String str4 = this.A0B;
        C18073Vl1 vl12 = this.A06;
        C18073Vl1 vl13 = vl12;
        CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1 = new CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1((WF8) obj2, vl13, str4, map, (AnonymousClass4D7) null, this.A0J, this.A0H);
        19B r10 = 19B.A00;
        AnonymousClass2Q8 A022 = 1Eo.A02(r10, commonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1$avatarConfigPrefetchAsync$1, r2);
        AnonymousClass2Q8 A023 = 1Eo.A02(r10, new C59703JUk((Object) this.A03, (Object) this.A07, (Object) this.A0E, (Object) vl12, (AnonymousClass4D7) null, 9), r2);
        long j = (long) (this.A02 * 1000.0d);
        JVZ jvz = new JVZ((AnonymousClass4D7) null, (Object) this.A05, (Object) this.A0F, (Object) vl13, (Object) A022, (Object) this.A09, (Object) A023, 1);
        this.A01 = null;
        this.A00 = 2;
        if (I3P.A00(this, jvz, j) == obj3) {
            return obj3;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonBloksActionHelper$onLiveEditorLoadLiveEditorActionExtended$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
