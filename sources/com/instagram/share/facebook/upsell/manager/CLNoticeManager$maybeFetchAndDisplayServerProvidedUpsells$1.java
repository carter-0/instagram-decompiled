package com.instagram.share.facebook.upsell.manager;

import X.002;
import X.00k;
import X.0KC;
import X.0Tu;
import X.0eS;
import X.0qQ;
import X.0rm;
import X.0sL;
import X.182;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass000;
import X.AnonymousClass12T;
import X.AnonymousClass1Ek;
import X.AnonymousClass3EF;
import X.AnonymousClass4CZ;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass818;
import X.C250663lr;
import X.C367188qK;
import X.C367198qL;
import X.C367278qU;
import X.C368368sV;
import X.C368388sX;
import X.C368398sY;
import X.C376569Im;
import X.C41547AwD;
import X.C41845B3m;
import X.C51965G9l;
import X.C51972G9s;
import X.C60340gF;
import X.C63433Kwt;
import X.C66160MFx;
import X.C66463MSr;
import X.C66579MXk;
import X.C70335O2n;
import X.I3P;
import X.LEO;
import X.LGS;
import X.MGM;
import android.app.Activity;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1", f = "CLNoticeManager.kt", i = {0}, l = {236, 256, 264, 285, 294, 306}, m = "invokeSuspend", n = {"results"}, s = {"L$0"})
public final class CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ AnonymousClass818 A03;
    public final /* synthetic */ C376569Im A04;
    public final /* synthetic */ ImmutableList A05;
    public final /* synthetic */ LEO A06;
    public final /* synthetic */ C66463MSr A07;
    public final /* synthetic */ C367188qK A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(Activity activity, AnonymousClass818 r3, C376569Im r4, ImmutableList immutableList, LEO leo, C66463MSr mSr, C367188qK r8, String str, AnonymousClass4D7 r10, boolean z) {
        super(2, r10);
        this.A08 = r8;
        this.A09 = str;
        this.A06 = leo;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = immutableList;
        this.A02 = activity;
        this.A0A = z;
        this.A07 = mSr;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        C367188qK r7 = this.A08;
        String str = this.A09;
        LEO leo = this.A06;
        AnonymousClass818 r2 = this.A03;
        C376569Im r3 = this.A04;
        ImmutableList immutableList = this.A05;
        return new CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(this.A02, r2, r3, immutableList, leo, this.A07, r7, str, r13, this.A0A);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6, types: [X.LBI, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        0rm r11;
        C368368sV r6;
        AnonymousClass4CZ r4;
        0sL mFx;
        int i;
        Object obj2 = 1Hj.A02;
        switch (this.A00) {
            case 0:
                0eS.A00(obj);
                String A0n = C51972G9s.A0n();
                r11 = C51965G9l.A11();
                try {
                    C367188qK r8 = this.A08;
                    long A012 = 182.A01(0Tu.A05, r8.A00, 36599946065153689L);
                    C41547AwD awD = new C41547AwD(this.A02, this.A05, r8, A0n, (AnonymousClass4D7) null, r11, this.A0A);
                    this.A01 = r11;
                    this.A00 = 1;
                    if (I3P.A00(this, awD, A012) == obj2) {
                        return obj2;
                    }
                } catch (AnonymousClass3EF unused) {
                    0KC.A0C(AnonymousClass000.A00(4316), 002.A0R("Timeout exception: Failed to fetch notice eligibility for ", this.A09));
                    this.A08.A02.A03(113);
                    AnonymousClass4CZ r5 = AnonymousClass12T.A00.A04;
                    C66160MFx mFx2 = new C66160MFx(this.A07, (AnonymousClass4D7) null, 26);
                    this.A01 = null;
                    this.A00 = 2;
                    if (1Eo.A00(this, r5, mFx2) == obj2) {
                        return obj2;
                    }
                }
                break;
            case 1:
                r11 = (0rm) this.A01;
                0eS.A00(obj);
                break;
            default:
                0eS.A00(obj);
                break;
        }
        Map map = (Map) r11.A00;
        if (map != null) {
            r6 = (C368368sV) map.get(this.A09);
        } else {
            r6 = null;
        }
        if (r6 == null) {
            i = 3;
            this.A08.A02.A03(3);
            r4 = AnonymousClass12T.A00.A04;
            mFx = new C66160MFx(this.A07, (AnonymousClass4D7) null, 27);
            this.A01 = null;
        } else {
            C367188qK r12 = this.A08;
            UserSession userSession = r12.A00;
            C70335O2n.A00(userSession, r6);
            LEO leo = this.A06;
            C63433Kwt.A00(userSession, r6, leo);
            0qQ.A0B(leo, 1);
            ? obj3 = new Object();
            obj3.A0B = null;
            obj3.A00 = null;
            obj3.A03 = null;
            obj3.A06 = null;
            obj3.A01 = null;
            obj3.A04 = null;
            obj3.A07 = null;
            obj3.A02 = null;
            obj3.A05 = null;
            obj3.A08 = null;
            obj3.A09 = null;
            obj3.A0A = null;
            Iterator it = C41845B3m.A0X(r6, C368398sY.class, "client_params", 7, 1311672120).iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                String A072 = A0V.A07("key");
                if (0qQ.A0K(A072, DialogModule.KEY_TITLE)) {
                    obj3.A0B = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_name_1")) {
                    obj3.A00 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_variant_1")) {
                    obj3.A03 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_markdown_text_1")) {
                    obj3.A06 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_name_2")) {
                    obj3.A01 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_variant_2")) {
                    obj3.A04 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_markdown_text_2")) {
                    obj3.A07 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_name_3")) {
                    obj3.A02 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_icon_variant_3")) {
                    obj3.A05 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, "body_markdown_text_3")) {
                    obj3.A08 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, C66579MXk.A00(40))) {
                    obj3.A09 = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                } else if (0qQ.A0K(A072, AnonymousClass000.A00(186))) {
                    obj3.A0A = A0V.getOptionalStringField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                }
            }
            leo.A07 = obj3;
            ImmutableList A062 = r6.A06(C368388sX.class, "native_auth_response", -1212312527);
            0qQ.A07(A062);
            ArrayList A0r = AnonymousClass7TG.A0r(A062);
            Iterator it2 = A062.iterator();
            while (it2.hasNext()) {
                String A0A2 = C41845B3m.A0V(it2).A0A(AnonymousClass000.A00(342));
                if (A0A2 == null) {
                    A0A2 = "";
                }
                A0r.add(A0A2);
            }
            leo.A0B = 00k.A0a(A0r);
            String str = this.A09;
            C367198qL r42 = r12.A02;
            LGS A013 = C367278qU.A01(userSession, r6, r42, str);
            if (A013 == null) {
                r4 = AnonymousClass12T.A00.A04;
                mFx = new C66160MFx(this.A07, (AnonymousClass4D7) null, 28);
                this.A01 = null;
                i = 4;
            } else {
                String optionalStringField = r6.getOptionalStringField(6, "client_session_id");
                if (optionalStringField == null) {
                    optionalStringField = "";
                }
                AnonymousClass818 r13 = this.A03;
                boolean A022 = C367278qU.A02(r13, this.A04, userSession, r42, A013, optionalStringField);
                r4 = AnonymousClass12T.A00.A04;
                if (A022) {
                    mFx = new MGM(r12, r13, leo, this.A07, A013, (AnonymousClass4D7) null, 11);
                    this.A01 = null;
                    i = 5;
                } else {
                    mFx = new C66160MFx(this.A07, (AnonymousClass4D7) null, 29);
                    this.A01 = null;
                    i = 6;
                }
            }
        }
        this.A00 = i;
        if (1Eo.A00(this, r4, mFx) == obj2) {
            return obj2;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
