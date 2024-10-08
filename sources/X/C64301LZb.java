package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.LZb  reason: case insensitive filesystem */
public final class C64301LZb implements C13907Tl7 {
    public C64164LRf A00;
    public L39 A01;
    public C262224Cq A02;
    public boolean A03;
    public final Integer A04 = AnonymousClass05K.A01;
    public final AnonymousClass0r6 A05;
    public final 0V2 A06;
    public final LGB A07;
    public final UserSession A08;

    public C64301LZb(LGB lgb, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A08 = userSession;
        this.A07 = lgb;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 10);
        this.A06 = A012;
        this.A05 = JTP.A10(A012);
    }

    public final void A00(Context context, ViewGroup viewGroup, C61042Jvg jvg, String str, C262224Cq r28) {
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 1);
        if (this.A03) {
            UserSession userSession = this.A08;
            0wc A012 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
            C63567KzG.A02 = AnonymousClass0Gt.A00;
            C63567KzG.A01 = A012;
            C63567KzG.A03 = (C18423VrS) C18423VrS.A01.getValue();
            AnonymousClass0JP r3 = C63567KzG.A02;
            String str2 = "clock";
            if (r3 != null) {
                C63567KzG.A05 = new C63574KzN(r3);
                C63567KzG.A04 = new C63574KzN(r3);
                C63567KzG.A06 = true;
                String str3 = str;
                C63567KzG.A00 = str;
                Integer num = AnonymousClass05K.A00;
                C63567KzG.A00(num, this.A04);
                C262224Cq r11 = r28;
                this.A02 = r11;
                C61042Jvg jvg2 = jvg;
                Context context2 = context;
                C64164LRf lRf = new C64164LRf(context2, this.A07, jvg2, r11);
                this.A00 = lRf;
                boolean z = jvg2.A01;
                lRf.A07 = userSession;
                str2 = "userSession";
                C312156dv A002 = C312146dt.A00(userSession);
                lRf.A05 = A002;
                UserSession userSession2 = lRf.A07;
                if (userSession2 != null) {
                    HashMap A013 = C64164LRf.A01(context2, lRf, A002, userSession2, false);
                    C392559v0 r4 = B37.A01;
                    C361848gv A003 = C64164LRf.A00(context2, lRf);
                    UserSession userSession3 = lRf.A07;
                    if (userSession3 != null) {
                        C312426eP r2 = lRf.A00;
                        if (r2 == null) {
                            str2 = "effectManagerFactory";
                        } else {
                            C41791B0u b0u = lRf.A03;
                            if (b0u == null) {
                                str2 = "dataProvider";
                            } else {
                                C312426eP r17 = r2;
                                AR2 ar2 = new AR2(r17, b0u, A003, userSession3, false);
                                0qQ.A0B(r4, 0);
                                A013.put(r4, ar2);
                                C392559v0 r0 = C39630A2u.A0B;
                                0qQ.A0B(r0, 0);
                                A013.put(r0, viewGroup2);
                                C392559v0 r1 = C39630A2u.A06;
                                Boolean valueOf = Boolean.valueOf(lRf.A0F.A00);
                                0qQ.A0B(r1, 0);
                                0qQ.A0B(valueOf, 1);
                                A013.put(r1, valueOf);
                                C392559v0 r12 = C39630A2u.A04;
                                Boolean A0l = DbT.A0l(z);
                                0qQ.A0B(r12, 0);
                                0qQ.A0B(A0l, 1);
                                A013.put(r12, A0l);
                                lRf.A0D.A00 = new C63572KzL(lRf);
                                HashMap A1E = AnonymousClass7TE.A1E();
                                A1E.putAll(A013);
                                lRf.A04 = new AH4(A1E);
                                JTO.A1Y(num, new MFS(this, (AnonymousClass4D7) null, 13), r11);
                                C64164LRf lRf2 = this.A00;
                                if (lRf2 == null) {
                                    str2 = "provider";
                                } else {
                                    AH4 ah4 = lRf2.A04;
                                    if (ah4 != null) {
                                        View Bf9 = ah4.A0E.Bf9();
                                        0qQ.A07(Bf9);
                                        Bf9.setVisibility(0);
                                    }
                                    if (C51966G9m.A1X(str3)) {
                                        A01(context2, str3);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new Exception();
    }

    public final void A01(Context context, String str) {
        0qQ.A0B(str, 0);
        C64164LRf lRf = this.A00;
        if (lRf != null) {
            AH4 ah4 = lRf.A04;
            if (ah4 != null) {
                ah4.A02();
            }
            C64164LRf lRf2 = this.A00;
            if (lRf2 != null) {
                lRf2.A04(context, str);
                return;
            }
        }
        0qQ.A0F("provider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(AnonymousClass07Z r2) {
        0qQ.A0B(r2, 0);
        this.A03 = true;
    }

    public final void onDestroy(AnonymousClass07Z r2) {
        0qQ.A0B(r2, 0);
        C64164LRf lRf = this.A00;
        if (lRf != null) {
            lRf.A03();
        }
        C63567KzG.A04 = null;
        C63567KzG.A05 = null;
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onResume(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void A02(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder) {
        C64164LRf lRf = this.A00;
        if (lRf == null) {
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lRf.A0E.A00.setAle(liveEditingRawMemoryPointerHolder);
        }
    }

    public final void A03(0eP r5) {
        C64164LRf lRf = this.A00;
        if (lRf == null) {
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        }
        C64357LaZ laZ = lRf.A0D;
        JSONObject A11 = DbS.A11();
        A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A00);
        A11.put("data", r5.A01);
        laZ.A02.A00(A11);
    }
}
