package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.8Wq  reason: invalid class name and case insensitive filesystem */
public final class C357128Wq implements C357138Wr {
    public AGt A00;
    public C357158Wt A01;
    public Runnable A02;
    public String A03;
    public final Context A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final 0wc A06;
    public final UserSession A07;
    public final AnonymousClass4D6 A08;
    public final AnonymousClass8Wp A09;
    public final AnonymousClass8Wm A0A;
    public final Runnable A0B;

    public static final void A03(C357128Wq r9, String str) {
        C357128Wq r2 = r9;
        if (r9.A09 != null) {
            Context context = r9.A04;
            String string = context.getString(2131968752);
            0qQ.A07(string);
            String string2 = context.getString(2131968753);
            0qQ.A07(string2);
            String string3 = context.getString(2131968755);
            String string4 = context.getString(2131968756);
            0qQ.A07(string4);
            r2.A06(C390709ri.A02, C390789rq.CAPTION, str, string2, string3, string4, string);
            r2.A0A.E0A();
        }
    }

    public final void A07(List list) {
        0qQ.A0B(list, 0);
        AGt aGt = this.A00;
        if (aGt != null) {
            17k.A0F(!aGt.A03);
            aGt.A09.A01(list);
        }
    }

    public static final void A00(C357128Wq r1) {
        C357158Wt r0 = r1.A01;
        if (r0 != null) {
            r0.A02();
        }
        r1.A0A.E09();
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.A1p, java.lang.Object] */
    public static final void A01(C357128Wq r10, C390709ri r11, C390789rq r12, Runnable runnable) {
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        Context context = r10.A04;
        C331157Pu A002 = C48943Emh.A00(r0.A02(context));
        1Yl A003 = C357108Wn.A00();
        if (A003.A00 == null) {
            A003.A00 = new Object();
        }
        UserSession userSession = r10.A07;
        String AbO = r10.A0A.AbO();
        boolean z = false;
        if (A002 != null) {
            z = true;
        }
        C40704AhO ahO = new C40704AhO();
        AnonymousClass7TG.A1U(r12, r11, AbO);
        C47457E3e e3e = new C47457E3e();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        A0a.putSerializable(AnonymousClass000.A00(393), r12);
        A0a.putSerializable(AnonymousClass000.A00(1225), r11);
        A0a.putString("action_source", AbO);
        A0a.putString("text_language", (String) null);
        A0a.putBoolean(AnonymousClass000.A00(313), z);
        e3e.setArguments(A0a);
        e3e.A00 = ahO;
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0X = new C389859qL(runnable);
        if (A002 != null) {
            A002.A0F(e3e, r1);
        } else {
            r1.A00().A03(context, e3e);
        }
    }

    public static final void A02(C357128Wq r8, String str) {
        0wc r3 = r8.A06;
        AnonymousClass8Wm r4 = r8.A0A;
        String AbO = r4.AbO();
        String str2 = r8.A03;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A002 = r3.A00(r3.A00, "instagram_wellbeing_warning_system_success_creation");
        A002.AAJ("source_of_action", AbO);
        A002.AAJ("text_language", str);
        A002.A7p("is_offensive", true);
        A002.AAJ(AnonymousClass9NE.A01(9, 10, 87), str2);
        A002.A9H("extra_values", hashMap);
        A002.Cgf();
        r4.E3I();
    }

    public final void A04() {
        AnonymousClass1O9 r4;
        1OC A012;
        String str;
        AnonymousClass8Wp r8 = this.A09;
        if (r8 != null) {
            UserSession userSession = this.A07;
            if (r8.Ers(userSession)) {
                AnonymousClass8Wm r0 = this.A0A;
                r0.Cxz();
                AGt aGt = this.A00;
                if (aGt != null) {
                    boolean Esk = r8.Esk(userSession);
                    int BnJ = r8.BnJ(userSession);
                    17k.A0F(!aGt.A03);
                    0mM r2 = aGt.A09;
                    if (r2.A02) {
                        Handler handler = r2.A05;
                        Runnable runnable = r2.A07;
                        handler.removeCallbacks(runnable);
                        runnable.run();
                    }
                    aGt.A03 = true;
                    boolean z = aGt.A04;
                    if (z || aGt.A00 != null) {
                        if (Esk) {
                            AnonymousClass1O8 r02 = aGt.A00;
                            if (r02 != null) {
                                r02.A00();
                                aGt.A00 = null;
                            }
                            aGt.A01 = new C39700A5q(false, (String) null);
                        } else {
                            if (z) {
                                AnonymousClass1O8 r03 = aGt.A00;
                                if (r03 != null) {
                                    r03.A00();
                                    aGt.A00 = null;
                                }
                                AGt.A01(aGt);
                            }
                            if (BnJ > 0) {
                                aGt.A05.postDelayed(aGt.A0B, (long) BnJ);
                                return;
                            }
                            return;
                        }
                    }
                    AGt.A00(aGt);
                    return;
                }
                int BnJ2 = r8.BnJ(userSession);
                AnonymousClass1O8 r6 = null;
                if (BnJ2 > 0) {
                    r6 = new AnonymousClass1O8();
                    r4 = r6.A00;
                } else {
                    r4 = null;
                }
                List content = r0.getContent();
                C385439iw r22 = new C385439iw(r4, userSession, new C40702AhM(this), AnonymousClass05K.A01);
                if (!r8.CXq()) {
                    if (!content.isEmpty()) {
                        str = (String) content.get(0);
                    } else {
                        str = "";
                    }
                    A012 = ABU.A00(r4, userSession, str);
                } else {
                    A012 = ABU.A01(r4, userSession, content);
                }
                A012.A00 = r22;
                this.A08.schedule(A012);
                if (BnJ2 > 0) {
                    C41096AoI aoI = new C41096AoI(r6, this);
                    this.A02 = aoI;
                    this.A05.postDelayed(aoI, (long) BnJ2);
                    return;
                }
                return;
            }
        }
        this.A0A.E3I();
    }

    public final void A05() {
        this.A05.removeCallbacks(this.A0B);
        AGt aGt = this.A00;
        if (aGt != null) {
            aGt.A09.A00();
        }
        this.A03 = null;
    }

    public final void A06(C390709ri r8, C390789rq r9, String str, String str2, String str3, String str4, String str5) {
        C358248ab r1 = new C358248ab(this.A04);
        r1.A05 = str5;
        r1.A0q("");
        r1.A0c(new AKR(this, str), str2);
        r1.A0b(new AKS(this, str), str4);
        r1.A0f(new AL2(this));
        r1.A0r(false);
        if (str3 != null) {
            r1.A0a(new C39942AKi(this, r8, r9, str), str3);
        }
        AnonymousClass0fN.A00(r1.A02());
        0wc r2 = this.A06;
        String AbO = this.A0A.AbO();
        String str6 = this.A03;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", AnonymousClass1QI.A00.A02.A00);
        0Aj A002 = r2.A00(r2.A00, C66579MXk.A00(920));
        A002.AAJ("source_of_action", AbO);
        A002.AAJ("text_language", str);
        A002.A7p("is_offensive", true);
        A002.AAJ(AnonymousClass9NE.A00(), str6);
        A002.A9H("extra_values", hashMap);
        A002.Cgf();
    }

    public final void DND() {
        0wc r4 = this.A06;
        AnonymousClass8Wm r3 = this.A0A;
        AIG.A00(r4, r3.AbO(), (String) null, this.A03);
        A01(this, C390709ri.A02, C390789rq.CAPTION, new C40918AlQ(this));
        r3.DND();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.8Wt, java.lang.Object] */
    public C357128Wq(Context context, ViewStub viewStub, AnonymousClass0iw r10, UserSession userSession, AnonymousClass4D6 r12, AnonymousClass8Wp r13, AnonymousClass8Wm r14) {
        UserSession userSession2 = userSession;
        this.A07 = userSession;
        this.A04 = context;
        AnonymousClass4D6 r3 = r12;
        this.A08 = r12;
        this.A09 = r13;
        this.A0A = r14;
        this.A06 = AnonymousClass0kN.A01(r10, userSession);
        this.A03 = UUID.randomUUID().toString();
        this.A0B = new C357148Ws(this);
        if (viewStub != null) {
            C357108Wn.A00();
            ? obj = new Object();
            obj.A02 = false;
            obj.A01 = viewStub;
            this.A01 = obj;
        }
        if (r13 != null && r13.Esl(userSession)) {
            this.A00 = new AGt(userSession2, r3, new A4X(this), r13.Bee(userSession), r13.CXq());
        }
    }

    public final void DuW() {
        A00(this);
        this.A05.removeCallbacks(this.A0B);
        0wc r4 = this.A06;
        AnonymousClass8Wm r3 = this.A0A;
        AIG.A02(r4, r3.AbO(), (String) null, this.A03);
        r3.DuW();
    }
}
