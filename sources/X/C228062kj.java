package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.lang.ref.WeakReference;

/* renamed from: X.2kj  reason: invalid class name and case insensitive filesystem */
public final class C228062kj {
    public C228422le A00;
    public C2356530r A01;
    public C2356730t A02;
    public 0wc A03;
    public 2el A04;
    public AnonymousClass34Y A05;
    public C230522pl A06;
    public AnonymousClass2r9 A07;
    public AnonymousClass2p6 A08;
    public C229982oj A09;
    public C229962oh A0A;
    public C230022on A0B;
    public C230192p8 A0C;
    public AnonymousClass2xI A0D;
    public AnonymousClass2xI A0E;
    public AnonymousClass2xI A0F;
    public AnonymousClass41L A0G;
    public C230162p3 A0H;
    public C229732nw A0I;
    public AnonymousClass36K A0J;
    public C229792oF A0K;
    public AnonymousClass2rB A0L;
    public C228392lb A0M;
    public AnonymousClass35K A0N;
    public C229752ny A0O;
    public C230672q0 A0P;
    public AnonymousClass3G9 A0Q;
    public C2356330p A0R;
    public AnonymousClass2lH A0S;
    public C228262l7 A0T;
    public AnonymousClass3GC A0U;
    public C50517Fdd A0V;
    public C10639RvY A0W;
    public AnonymousClass36J A0X;
    public AnonymousClass3GA A0Y;
    public AnonymousClass2lZ A0Z;
    public C231022qk A0a;
    public C231162qy A0b;
    public 1Pp A0c;
    public AnonymousClass36L A0d;
    public C229722nv A0e;
    public AnonymousClass35S A0f;
    public AnonymousClass35T A0g;
    public AnonymousClass35U A0h;
    public AnonymousClass2qE A0i;
    public AnonymousClass36C A0j;
    public C230782qG A0k;
    public C2357030w A0l;
    public C238663Ct A0m;
    public AnonymousClass364 A0n;
    public C231192r7 A0o;
    public AnonymousClass36Y A0p;
    public AnonymousClass3GF A0q;
    public C238933Dz A0r;
    public C238893Dv A0s;
    public AnonymousClass36O A0t;
    public C227762js A0u;
    public AnonymousClass3E6 A0v;
    public 2el A0w;
    public C2355030c A0x;
    public C230692q2 A0y;
    public AnonymousClass2oD A0z;
    public C230062or A10;
    public C229982oj A11;
    public AnonymousClass2oG A12;
    public AnonymousClass3GD A13;
    public AnonymousClass2xI A14;
    public AnonymousClass356 A15;
    public AnonymousClass2xS A16;
    public C230292pL A17;
    public C230142oz A18;
    public AnonymousClass35N A19;
    public AnonymousClass2lC A1A;
    public AnonymousClass2rI A1B;
    public AnonymousClass2r8 A1C;
    public C229332nD A1D;
    public C229182my A1E;
    public C2365134a A1F;
    public C228322lL A1G;
    public AnonymousClass2l3 A1H;
    public C228302lG A1I;
    public AnonymousClass2lT A1J;
    public C229772oA A1K;
    public AnonymousClass2oB A1L;
    public AnonymousClass3E0 A1M;
    public AnonymousClass358 A1N;
    public AnonymousClass3KB A1O;
    public C238183Aw A1P;
    public C230282pK A1Q;
    public AnonymousClass2pM A1R;
    public C230072os A1S;
    public AnonymousClass35L A1T;
    public AnonymousClass366 A1U;
    public C234422xq A1V;
    public C228312lJ A1W;
    public C230212pD A1X;
    public AnonymousClass34T A1Y;
    public C2355530h A1Z;
    public AnonymousClass35M A1a;
    public C228232l0 A1b;
    public C230702q3 A1c;
    public AnonymousClass3JG A1d;
    public C230662pz A1e;
    public C228472lj A1f;
    public AnonymousClass35W A1g;
    public C229142mu A1h;
    public AnonymousClass35V A1i;
    public C229112mr A1j;
    public AnonymousClass2o0 A1k;
    public C228192kw A1l;
    public C230822qK A1m;
    public C238203Ay A1n;
    public C228462li A1o;
    public AnonymousClass365 A1p;
    public AnonymousClass36M A1q;
    public AnonymousClass354 A1r;
    public final Context A1s;
    public final UserSession A1t;
    public final AnonymousClass2kR A1u;
    public final AnonymousClass2k9 A1v;
    public final C228152ks A1w;
    public final C228182kv A1x;
    public final C228102kn A1y;
    public final C227872kC A1z;
    public final C227802jw A20;
    public final AnonymousClass0eM A21 = AnonymousClass1YB.A00(new AnonymousClass9LY(this, 45));

    public C228062kj(AnonymousClass2kR r4, AnonymousClass2k9 r5, C227872kC r6, C227802jw r7) {
        0qQ.A0B(r6, 3);
        0qQ.A0B(r5, 4);
        this.A1u = r4;
        this.A20 = r7;
        this.A1z = r6;
        this.A1v = r5;
        this.A1s = r4.A00;
        UserSession userSession = r4.A01;
        this.A1t = userSession;
        C228102kn A002 = C228092km.A00(userSession);
        0qQ.A07(A002);
        this.A1y = A002;
        this.A1w = new C228152ks();
        this.A1x = new C228182kv();
    }

    private final C230142oz A00() {
        C230142oz r1 = this.A18;
        if (r1 != null) {
            return r1;
        }
        Fragment fragment = this.A20;
        FragmentActivity requireActivity = fragment.requireActivity();
        Context context = this.A1s;
        0gy A002 = AnonymousClass07i.A00(fragment);
        AnonymousClass4DU r3 = AnonymousClass2kO.A00;
        UserSession userSession = this.A1t;
        C230142oz r12 = new C230142oz(requireActivity, r3, userSession, A0B(), new C230132oy(context, A002, r3, userSession), AnonymousClass05K.A00);
        this.A18 = r12;
        return r12;
    }

    public final C238893Dv A01() {
        C238893Dv r2 = this.A0s;
        if (r2 != null) {
            return r2;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C227802jw r22 = this.A20;
        C238893Dv r23 = new C238893Dv(new C231612rx(r22, r22.requireActivity()), 0);
        this.A0s = r23;
        return r23;
    }

    public final AnonymousClass36O A02() {
        AnonymousClass36O r0 = this.A0t;
        if (r0 != null) {
            return r0;
        }
        boolean z = AnonymousClass36O.A0G;
        UserSession userSession = this.A1t;
        C227802jw r1 = this.A20;
        0hq r2 = r1.mFragmentManager;
        if (r2 != null) {
            AnonymousClass36O r02 = new AnonymousClass36O(r1, r2, (AnonymousClass57Y) null, userSession, AnonymousClass0t1.A01.A01(userSession), AnonymousClass05K.A0r, (0sP) null);
            this.A0t = r02;
            return r02;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C227762js A03() {
        C227762js r0 = this.A0u;
        Float f = null;
        if (r0 != null) {
            return r0;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context context = this.A1s;
        UserSession userSession = this.A1t;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318999369423661L)) {
            f = Float.valueOf((float) (((double) AnonymousClass0nB.A00(context)) * 182.A00(r2, userSession, 37163424299745565L)));
        }
        C227762js A002 = C227752jr.A00(context, f, true);
        this.A0u = A002;
        return A002;
    }

    public final AnonymousClass3E6 A04() {
        AnonymousClass3E6 r0 = this.A0v;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(AnonymousClass2kO.A00, false, false);
        this.A0v = A012;
        return A012;
    }

    public final 2el A05() {
        2el r0 = this.A0w;
        if (r0 != null) {
            return r0;
        }
        2el A012 = C71682ef.A01((0lg) null, C71682ef.A00());
        this.A0w = A012;
        return A012;
    }

    public final C2355030c A06() {
        C2355030c r2 = this.A0x;
        if (r2 != null) {
            return r2;
        }
        C227802jw r3 = this.A20;
        AnonymousClass4DU r5 = AnonymousClass2kO.A00;
        AnonymousClass2rI A0J2 = A0J();
        C230522pl r4 = this.A06;
        if (r4 == null) {
            r4 = new C230522pl(r3.requireActivity(), this.A1t, r5, A0K());
            this.A06 = r4;
        }
        C2355030c r22 = new C2355030c(r3, r4, r5, A0J2, true);
        this.A0x = r22;
        return r22;
    }

    public final C230692q2 A07() {
        C230692q2 r3 = this.A0y;
        if (r3 != null) {
            return r3;
        }
        C230692q2 r32 = new C230692q2(this.A1t, A0s(), A0o());
        this.A0y = r32;
        return r32;
    }

    public final AnonymousClass2oD A08() {
        AnonymousClass2oD r3 = this.A0z;
        if (r3 != null) {
            return r3;
        }
        C227802jw r2 = this.A20;
        AnonymousClass2oD r32 = new AnonymousClass2oD(r2, this.A1t, AnonymousClass2kO.A00, r2);
        this.A0z = r32;
        return r32;
    }

    public final C230062or A09() {
        C230062or r0 = this.A10;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass4DU r2 = AnonymousClass2kO.A00;
        String moduleName = r2.getModuleName();
        FragmentActivity requireActivity = this.A20.requireActivity();
        UserSession userSession = this.A1t;
        C230062or r02 = new C230062or(requireActivity, r2, userSession, new C230052oq(r2, userSession), moduleName);
        this.A10 = r02;
        return r02;
    }

    public final C229982oj A0A() {
        C229982oj r0 = this.A11;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        C227802jw r1 = this.A20;
        AnonymousClass4DU r3 = AnonymousClass2kO.A00;
        FragmentActivity requireActivity = r1.requireActivity();
        Integer num = AnonymousClass05K.A00;
        AnonymousClass2oG A0B2 = A0B();
        C229962oh r5 = this.A0A;
        if (r5 == null) {
            r5 = new C229962oh(r3, userSession);
            this.A0A = r5;
        }
        C229982oj r02 = new C229982oj(r1, requireActivity, r3, userSession, r5, A0B2, new C229972oi(this), num);
        this.A11 = r02;
        return r02;
    }

    public final AnonymousClass2oG A0B() {
        AnonymousClass2oG r0 = this.A12;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        C228182kv r5 = this.A1x;
        AnonymousClass2oG r02 = new AnonymousClass2oG(this.A1s, AnonymousClass2kO.A00, userSession, A05(), r5);
        this.A12 = r02;
        return r02;
    }

    public final AnonymousClass3GD A0C() {
        AnonymousClass3GD r0 = this.A13;
        if (r0 != null) {
            return r0;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C227802jw r02 = this.A20;
        FragmentActivity requireActivity = r02.requireActivity();
        UserSession userSession = this.A1t;
        AnonymousClass4DU r4 = AnonymousClass2kO.A00;
        AnonymousClass3GC r5 = this.A0U;
        if (r5 == null) {
            r5 = new AnonymousClass3GC(r02.A07);
            this.A0U = r5;
        }
        AnonymousClass3GD r03 = new AnonymousClass3GD(requireActivity, userSession, this.A1w, r4, r5);
        this.A13 = r03;
        return r03;
    }

    public final AnonymousClass2xI A0D() {
        AnonymousClass2xI r2 = this.A14;
        if (r2 != null) {
            return r2;
        }
        UserSession userSession = this.A1t;
        AnonymousClass2xI r22 = new AnonymousClass2xI(userSession, new C2355230e(userSession));
        this.A14 = r22;
        return r22;
    }

    public final AnonymousClass356 A0E() {
        AnonymousClass356 r1 = this.A15;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass356 r12 = new AnonymousClass356(this.A1s, new AnonymousClass355(A10()), this.A20.A0k, 2131970975);
        this.A15 = r12;
        return r12;
    }

    public final AnonymousClass2xS A0F() {
        AnonymousClass2xS r3 = this.A16;
        if (r3 != null) {
            return r3;
        }
        Context context = this.A1s;
        UserSession userSession = this.A1t;
        AnonymousClass2rI A0J2 = A0J();
        String str = this.A1x.A01;
        2el A052 = A05();
        C228392lb A0K2 = A0K();
        AnonymousClass2lT A0S2 = A0S();
        C227802jw r5 = this.A20;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        AnonymousClass2xS r32 = new AnonymousClass2xS(context, r5, userSession, A052, AnonymousClass2kO.A00, A0S2, A0J2, A0K2, new AnonymousClass2xQ(new AnonymousClass2xP(0.2f, 0.15f), (AudioOverlayTrack) null, false, true, true, true, true), AnonymousClass05K.A00, str, true);
        this.A16 = r32;
        return r32;
    }

    public final C230292pL A0G() {
        C230292pL r2 = this.A17;
        if (r2 != null) {
            return r2;
        }
        FragmentActivity requireActivity = this.A20.requireActivity();
        UserSession userSession = this.A1t;
        C230292pL r22 = new C230292pL(requireActivity, userSession, 182.A01(0Tu.A05, userSession, 36594362621691587L));
        this.A17 = r22;
        return r22;
    }

    public final AnonymousClass35N A0H() {
        AnonymousClass35N r0 = this.A19;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        C227802jw r2 = this.A20;
        AnonymousClass35N r02 = new AnonymousClass35N(r2.requireActivity(), r2, A03(), userSession, AnonymousClass2kO.A00, A0T(), r2.Cda());
        this.A19 = r02;
        return r02;
    }

    public final AnonymousClass2lC A0I() {
        AnonymousClass2lC r1 = this.A1A;
        if (r1 != null) {
            return r1;
        }
        2el r0 = this.A04;
        if (r0 == null) {
            r0 = C71682ef.A01((0lg) null, C71682ef.A00());
            this.A04 = r0;
        }
        AnonymousClass2lC r12 = new AnonymousClass2lC(r0);
        this.A1A = r12;
        return r12;
    }

    public final AnonymousClass2rI A0J() {
        AnonymousClass2rI r0 = this.A1B;
        if (r0 != null) {
            return r0;
        }
        Fragment fragment = this.A20;
        UserSession userSession = this.A1t;
        C228152ks r68 = this.A1w;
        C228102kn r27 = this.A1y;
        A0k();
        FragmentActivity requireActivity = fragment.requireActivity();
        C229112mr A0s2 = A0s();
        AnonymousClass4DU r5 = AnonymousClass2kO.A00;
        C229382nI A002 = A0q().A00();
        C228392lb A0K2 = A0K();
        C229722nv r02 = this.A0e;
        C229722nv r21 = r02;
        if (r02 == null) {
            r21 = new C229722nv(this.A1z);
            this.A0e = r21;
        }
        AnonymousClass2lC A0I2 = A0I();
        C229732nw r03 = new C229732nw(userSession, r5);
        AnonymousClass2oB A0U2 = A0U();
        AnonymousClass2rB r4 = this.A0L;
        if (r4 == null) {
            FragmentActivity requireActivity2 = fragment.requireActivity();
            AnonymousClass2kR r30 = this.A1u;
            0Pk r04 = 0Pl.A0n;
            Context context = this.A1s;
            0Pl A003 = r04.A00(context, userSession);
            C228182kv r23 = this.A1x;
            AnonymousClass2oD A082 = A08();
            C229382nI A004 = A0q().A00();
            C229792oF r15 = this.A0K;
            if (r15 == null) {
                r15 = new C229792oF(AnonymousClass05K.A00, AnonymousClass05K.A0F);
                this.A0K = r15;
            }
            C230022on r14 = this.A0B;
            if (r14 == null) {
                r14 = new C230022on(userSession, A05(), A0A(), r23);
                this.A0B = r14;
            }
            C229982oj A0A2 = A0A();
            C229982oj r05 = this.A09;
            C229982oj r19 = r05;
            if (r05 == null) {
                AnonymousClass0iw r3 = new 0xG("empty_feed_timeline");
                FragmentActivity requireActivity3 = fragment.requireActivity();
                Integer num = AnonymousClass05K.A00;
                AnonymousClass2oG A0B2 = A0B();
                C229962oh r06 = this.A0A;
                if (r06 == null) {
                    r06 = new C229962oh(r5, userSession);
                    this.A0A = r06;
                }
                r19 = new C229982oj(fragment, requireActivity3, r3, userSession, r06, A0B2, (C229972oi) null, num);
                this.A09 = r19;
            }
            C230062or A092 = A09();
            C230072os A0b2 = A0b();
            C230162p3 r13 = this.A0H;
            if (r13 == null) {
                r13 = new C230162p3(userSession, A05(), A00(), r23);
                this.A0H = r13;
            }
            C230142oz A005 = A00();
            AnonymousClass2p6 r12 = this.A08;
            if (r12 == null) {
                r12 = new AnonymousClass2p6(fragment, r5, userSession);
                this.A08 = r12;
            }
            C230192p8 r07 = this.A0C;
            C230192p8 r18 = r07;
            if (r07 == null) {
                r18 = new C230192p8(context, fragment, userSession, A05(), r5);
                this.A0C = r18;
            }
            C229332nD A0M2 = A0M();
            C229182my A0N2 = A0N();
            C228392lb A0K3 = A0K();
            C230212pD A0g2 = A0g();
            C230272pJ r08 = new C230272pJ(A05());
            AnonymousClass2pM A0a2 = A0a();
            C228392lb A0K4 = A0K();
            C230522pl r10 = this.A06;
            if (r10 == null) {
                r10 = new C230522pl(fragment.requireActivity(), userSession, r5, A0K());
                this.A06 = r10;
            }
            C230582pr r09 = new C230582pr(userSession, A05());
            C230662pz A0n2 = A0n();
            C230672q0 r9 = this.A0P;
            if (r9 == null) {
                r9 = new C230672q0(r5, this.A1v.BOL(), A0o(), new AnonymousClass9LY(this, 42));
                this.A0P = r9;
            }
            C230702q3 A0l2 = A0l();
            AnonymousClass2qE r7 = this.A0i;
            if (r7 == null) {
                r7 = new AnonymousClass2qE(userSession, r23, new C230762qD(fragment, userSession), this.A1z);
                this.A0i = r7;
            }
            C230782qG r6 = this.A0k;
            if (r6 == null) {
                r6 = new C230782qG(userSession, this.A1z, this);
                this.A0k = r6;
            }
            AnonymousClass2oB A0U3 = A0U();
            2bv r22 = A0v().A05;
            C231022qk r11 = this.A0a;
            if (r11 == null) {
                Fragment fragment2 = fragment;
                UserSession userSession2 = userSession;
                AnonymousClass4DU r81 = r5;
                r11 = new C231022qk(fragment2, userSession2, A05(), r81, C231012qj.FEED_PRODUCT_PIVOTS, fragment.A0K, (String) null, (String) null, (String) null, -1);
                this.A0a = r11;
            }
            C231162qy r8 = this.A0b;
            if (r8 == null) {
                Fragment fragment3 = fragment;
                UserSession userSession3 = userSession;
                AnonymousClass4DU r812 = r5;
                r8 = new C231162qy(fragment3, userSession3, A05(), r812, (AnonymousClass57K) null, AnonymousClass05K.A01, (String) null, (String) null, fragment.A0K, (String) null, (String) null, (String) null, -1);
                this.A0b = r8;
            }
            C231192r7 r32 = this.A0o;
            if (r32 == null) {
                r32 = new C231192r7(A0Q());
                this.A0o = r32;
            }
            AnonymousClass2r8 A0L2 = A0L();
            C228232l0 A0k2 = A0k();
            AnonymousClass2r9 r010 = this.A07;
            if (r010 == null) {
                r010 = new AnonymousClass2r9(userSession, A05(), r5);
                this.A07 = r010;
            }
            r4 = new AnonymousClass2rB(fragment, requireActivity2, A004, A082, r10, A092, r010, r30, r12, A0A2, r19, r14, r18, r7, A0K3, A003, A005, r13, r15, A0K4, r09, A0L2, A0M2, A0N2, A0a2, A0b2, A0U3, r6, r22, A0g2, r27, r08, r8, r11, A0k2, r9, A0l2, r23, A0n2, fragment, r32);
            this.A0L = r4;
        }
        AnonymousClass2rI r63 = new AnonymousClass2rI(requireActivity, fragment, A002, userSession, r68, r5, A0I2, r03, r4, A0K2, A0U2, fragment, A0s2, r21);
        this.A1B = r63;
        return r63;
    }

    public final C228392lb A0K() {
        C228392lb r2 = this.A0M;
        if (r2 != null) {
            return r2;
        }
        C228392lb r22 = new C228392lb(this.A1s, this.A1t);
        this.A0M = r22;
        return r22;
    }

    public final AnonymousClass2r8 A0L() {
        AnonymousClass2r8 r3 = this.A1C;
        if (r3 != null) {
            return r3;
        }
        C227802jw r2 = this.A20;
        AnonymousClass2r8 r32 = new AnonymousClass2r8(r2.requireActivity(), r2, this.A1t);
        this.A1C = r32;
        return r32;
    }

    public final C229332nD A0M() {
        C229332nD r2 = this.A1D;
        if (r2 != null) {
            return r2;
        }
        C229332nD r22 = new C229332nD(this.A1t, this.A1s);
        this.A1D = r22;
        return r22;
    }

    public final C229182my A0N() {
        C229182my r3 = this.A1E;
        if (r3 != null) {
            return r3;
        }
        C229182my r32 = new C229182my(AnonymousClass2kO.A00, this.A1t, A05());
        this.A1E = r32;
        return r32;
    }

    public final C2365134a A0O() {
        C2365134a r0 = this.A1F;
        if (r0 != null) {
            return r0;
        }
        Context context = this.A1s;
        C227802jw r3 = this.A20;
        FragmentActivity requireActivity = r3.requireActivity();
        C228152ks r8 = this.A1w;
        AnonymousClass2rI A0J2 = A0J();
        UserSession userSession = this.A1t;
        2Zg A072 = r3.A07();
        AnonymousClass2l3 A0Q2 = A0Q();
        2el A052 = A05();
        AnonymousClass34T A0h2 = A0h();
        C228322lL A0P2 = A0P();
        AnonymousClass34Y r7 = this.A05;
        if (r7 == null) {
            r7 = new AnonymousClass34Y();
            this.A05 = r7;
        }
        C2365134a r02 = new C2365134a(requireActivity, context, r3, AnonymousClass2kO.A00, userSession, A052, r7, r8, A0J2, A0P2, A0Q2, A0R(), A0h2, A072);
        this.A1F = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.2jw, X.2jx] */
    public final C228322lL A0P() {
        C228322lL r0 = this.A1G;
        if (r0 != null) {
            return r0;
        }
        ? r2 = this.A20;
        UserSession userSession = this.A1t;
        0gy A002 = AnonymousClass07i.A00(r2);
        AnonymousClass4DU r3 = AnonymousClass2kO.A00;
        C228322lL r02 = new C228322lL(A002, r2, r3, userSession, r3);
        this.A1G = r02;
        return r02;
    }

    public final AnonymousClass2l3 A0Q() {
        AnonymousClass2l3 r2 = this.A1H;
        if (r2 != null) {
            return r2;
        }
        18q r0 = AnonymousClass2l3.A0V;
        Context applicationContext = this.A1s.getApplicationContext();
        0qQ.A07(applicationContext);
        UserSession userSession = this.A1t;
        18g A012 = C638918c.A01(C61170le.A00);
        String moduleName = AnonymousClass2kO.A00.getModuleName();
        C228152ks r6 = this.A1w;
        MessageQueue myQueue = Looper.myQueue();
        0qQ.A07(myQueue);
        C228262l7 r7 = this.A0T;
        if (r7 == null) {
            r7 = new C228262l7(userSession, this.A20.A0C, new AnonymousClass9LE(this, 6));
            this.A0T = r7;
        }
        AnonymousClass2l3 r22 = new AnonymousClass2l3(applicationContext, myQueue, userSession, r6, r7, A012, moduleName);
        this.A1H = r22;
        return r22;
    }

    public final C228302lG A0R() {
        C228302lG r2 = this.A1I;
        if (r2 != null) {
            return r2;
        }
        long j = C228302lG.A0B;
        C228302lG r22 = new C228302lG(this.A1t, A0Q());
        this.A1I = r22;
        return r22;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2lU, X.2lT] */
    public final AnonymousClass2lT A0S() {
        AnonymousClass2lT r0 = this.A1J;
        if (r0 != null) {
            return r0;
        }
        String moduleName = AnonymousClass2kO.A00.getModuleName();
        UserSession userSession = this.A1t;
        0qQ.A0B(moduleName, 1);
        ? r02 = new AnonymousClass2lU(moduleName, userSession, (1Xj) null);
        this.A1J = r02;
        return r02;
    }

    public final C229772oA A0T() {
        Integer num;
        C229772oA r0 = this.A1K;
        if (r0 == null) {
            C228192kw A0u2 = A0u();
            AnonymousClass2o0 A0t2 = A0t();
            if (A0u2.A00 == null) {
                01N A1H2 = 0jo.A1H();
                UserSession userSession = A0u2.A03;
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 36318999369292588L)) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                A1H2.add(new AnonymousClass2o1(num));
                if (AnonymousClass0t1.A01.A01(userSession).A1p() || AnonymousClass2o2.A00(userSession)) {
                    A1H2.add(new AnonymousClass2o1(AnonymousClass05K.A0j));
                }
                if (182.A06(r2, userSession, 36313888359713048L)) {
                    A1H2.add(new AnonymousClass2o1(AnonymousClass05K.A0C));
                }
                if (182.A06(r2, userSession, 36313888359581974L)) {
                    A1H2.add(new AnonymousClass2o1(AnonymousClass05K.A0N));
                }
                if (182.A06(r2, userSession, 36329195621597041L)) {
                    A1H2.add(new AnonymousClass2o1(AnonymousClass05K.A0u));
                }
                if (2R8.A00(userSession) && 182.A06(r2, userSession, 36318101721061241L)) {
                    A1H2.add(new AnonymousClass2o1(AnonymousClass05K.A15));
                }
                01N A1I2 = 0jo.A1I(A1H2);
                C229772oA r02 = new C229772oA(A0u2.A02, userSession, (AnonymousClass2o1) A1I2.get(0), A1I2);
                A0u2.A00 = r02;
                r02.A05.add(A0t2);
                A0u2.A01 = A0t2;
            }
            r0 = A0u2.A00;
            if (r0 == null) {
                0qQ.A0F("feedPickerStateManager");
                throw AnonymousClass00P.createAndThrow();
            }
            this.A1K = r0;
        }
        return r0;
    }

    public final AnonymousClass2oB A0U() {
        AnonymousClass2oB r0 = this.A1L;
        if (r0 != null) {
            return r0;
        }
        C229752ny r7 = this.A0O;
        if (r7 == null) {
            r7 = new C229752ny(this.A20, this.A1t);
            this.A0O = r7;
        }
        C229772oA A0T2 = A0T();
        C227802jw r2 = this.A20;
        AnonymousClass9LR r10 = new AnonymousClass9LR(this, 26);
        AnonymousClass4DU r4 = AnonymousClass2kO.A00;
        C229762nz BOL = this.A1v.BOL();
        Resources resources = r2.requireContext().getResources();
        0qQ.A07(resources);
        AnonymousClass2oB r02 = new AnonymousClass2oB(resources, r2, this.A1t, r4, BOL, A0T2, r7, this.A1x, r2, r10);
        this.A1L = r02;
        return r02;
    }

    public final AnonymousClass3E0 A0V() {
        AnonymousClass3E0 r1 = this.A1M;
        if (r1 != null) {
            return r1;
        }
        C238933Dz r3 = this.A0r;
        if (r3 == null) {
            r3 = new C238933Dz(this.A1t, A0v());
            this.A0r = r3;
        }
        AnonymousClass3E0 r12 = new AnonymousClass3E0(new AnonymousClass9LR(r3, 27), new C377439Lv(45, r3, this));
        this.A1M = r12;
        return r12;
    }

    public final AnonymousClass358 A0W() {
        AnonymousClass358 r0 = this.A1N;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass356 A0E2 = A0E();
        C227872kC r5 = this.A1z;
        AnonymousClass358 r02 = new AnonymousClass358(A03(), this.A1t, A0E2, A0O(), r5);
        this.A1N = r02;
        return r02;
    }

    public final AnonymousClass3KB A0X() {
        AnonymousClass3KB r0 = this.A1O;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass9LY r4 = new AnonymousClass9LY(this, 46);
        AnonymousClass9LY r5 = new AnonymousClass9LY(this, 47);
        AnonymousClass9LY r6 = new AnonymousClass9LY(this, 48);
        AnonymousClass3KB r02 = new AnonymousClass3KB(this.A1t, this.A20.A07, (AnonymousClass2lI) this.A21.getValue(), r4, r5, r6);
        this.A1O = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.0JR] */
    public final C238183Aw A0Y() {
        C238183Aw r4 = this.A1P;
        if (r4 != null) {
            return r4;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        UserSession userSession = this.A1t;
        AnonymousClass4DU r3 = AnonymousClass2kO.A00;
        C238183Aw r42 = new C238183Aw(new Object(), AnonymousClass0kN.A01(r3, userSession), r3, A0s());
        this.A1P = r42;
        return r42;
    }

    public final C230282pK A0Z() {
        C230282pK r3 = this.A1Q;
        if (r3 != null) {
            return r3;
        }
        UserSession userSession = this.A1t;
        C228182kv r1 = this.A1x;
        AnonymousClass4DU r0 = AnonymousClass2kO.A00;
        C230282pK r32 = new C230282pK(r0, userSession, r0, r1);
        this.A1Q = r32;
        return r32;
    }

    public final AnonymousClass2pM A0a() {
        AnonymousClass2pM r0 = this.A1R;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        C228182kv r6 = this.A1x;
        AnonymousClass4DU r3 = AnonymousClass2kO.A00;
        C230282pK A0Z2 = A0Z();
        AnonymousClass2pM r02 = new AnonymousClass2pM(userSession, A05(), r3, A0G(), A0Z2, r6);
        this.A1R = r02;
        return r02;
    }

    public final C230072os A0b() {
        C230072os r0 = this.A1S;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        C228182kv r5 = this.A1x;
        C230072os r02 = new C230072os(this.A1s, AnonymousClass2kO.A00, userSession, A05(), r5);
        this.A1S = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.0JR] */
    public final AnonymousClass35L A0c() {
        AnonymousClass35L r0 = this.A1T;
        if (r0 != null) {
            return r0;
        }
        C227802jw r2 = this.A20;
        UserSession userSession = this.A1t;
        0wc r4 = this.A03;
        if (r4 == null) {
            r4 = AnonymousClass0kN.A01(AnonymousClass2kO.A00, userSession);
            this.A03 = r4;
        }
        AnonymousClass2rI A0J2 = A0J();
        AnonymousClass2oB A0U2 = A0U();
        C228182kv r8 = this.A1x;
        AnonymousClass35L r02 = new AnonymousClass35L(new Object(), r2, AnonymousClass2kO.A00, r4, userSession, A0J2, A0U2, r8);
        this.A1T = r02;
        return r02;
    }

    public final AnonymousClass366 A0d() {
        AnonymousClass366 r4 = this.A1U;
        if (r4 != null) {
            return r4;
        }
        AnonymousClass366 r42 = new AnonymousClass366(this.A20, A06(), A0J(), A0c());
        this.A1U = r42;
        return r42;
    }

    public final C234422xq A0e() {
        C234422xq r1 = this.A1V;
        if (r1 != null) {
            return r1;
        }
        C234422xq r12 = new C234422xq(this.A1s, this.A1t, AnonymousClass2kO.A00, new AnonymousClass2xP(0.2f, 0.15f));
        this.A1V = r12;
        return r12;
    }

    public final C228312lJ A0f() {
        C228312lJ r0 = this.A1W;
        if (r0 != null) {
            return r0;
        }
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context context = this.A1s;
        String moduleName = AnonymousClass2kO.A00.getModuleName();
        UserSession userSession = this.A1t;
        02m r2 = 02m.A0p;
        0qQ.A07(r2);
        C228312lJ r02 = new C228312lJ(context, r2, userSession, moduleName, 498994024);
        this.A1W = r02;
        return r02;
    }

    public final C230212pD A0g() {
        C230212pD r0 = this.A1X;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        AnonymousClass4DU r4 = AnonymousClass2kO.A00;
        C228102kn A002 = C228092km.A00(userSession);
        C227802jw r1 = this.A20;
        C228152ks r3 = this.A1w;
        C228182kv r6 = this.A1x;
        C228472lj r7 = this.A1f;
        if (r7 == null) {
            0qQ.A0F("_mainFeedDeliveryController");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(A002, 2);
        0qQ.A0B(r3, 4);
        0qQ.A0B(r6, 5);
        C230212pD r02 = new C230212pD(r1, userSession, r3, r4, A002, r6, r7);
        this.A1X = r02;
        return r02;
    }

    public final AnonymousClass34T A0h() {
        AnonymousClass34T r0 = this.A1Y;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass34T r02 = new AnonymousClass34T(AnonymousClass2kO.A00, this.A1t);
        this.A1Y = r02;
        return r02;
    }

    public final C2355530h A0i() {
        C2355530h r1 = this.A1Z;
        if (r1 != null) {
            return r1;
        }
        C227802jw r3 = this.A20;
        C2355530h r12 = new C2355530h(r3, AnonymousClass2kO.A00, new C2355430g(r3.getRootActivity()));
        this.A1Z = r12;
        return r12;
    }

    public final AnonymousClass35M A0j() {
        AnonymousClass35M r3 = this.A1a;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass35M A0F2 = C249713kF.A00.A0F(this.A1t);
        C227802jw r2 = this.A20;
        A0F2.A04 = new WeakReference(r2.requireActivity());
        A0F2.A03 = new WeakReference(r2);
        this.A1a = A0F2;
        return A0F2;
    }

    public final C228232l0 A0k() {
        C228232l0 r0 = this.A1b;
        if (r0 != null) {
            return r0;
        }
        C228222kz A002 = C228202kx.A00(this.A1t, AnonymousClass2kO.A00, this.A1x);
        this.A1b = A002;
        return A002;
    }

    public final C230702q3 A0l() {
        C230702q3 r0 = this.A1c;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        2el A052 = A05();
        AnonymousClass4DU r5 = AnonymousClass2kO.A00;
        C230702q3 r02 = new C230702q3(AnonymousClass0kN.A01(r5, userSession), userSession, A052, A07(), r5, A0S(), A0f());
        this.A1c = r02;
        return r02;
    }

    public final AnonymousClass3JG A0m() {
        AnonymousClass3JG r0 = this.A1d;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        AnonymousClass2rI A0J2 = A0J();
        C227872kC r12 = this.A1z;
        C238893Dv A012 = A01();
        AnonymousClass354 A102 = A10();
        AnonymousClass35N A0H2 = A0H();
        AnonymousClass358 A0W2 = A0W();
        0wc r4 = this.A03;
        if (r4 == null) {
            r4 = AnonymousClass0kN.A01(AnonymousClass2kO.A00, userSession);
            this.A03 = r4;
        }
        C228152ks r10 = this.A1w;
        C227762js A032 = A03();
        C230822qK A0v2 = A0v();
        C229772oA A0T2 = A0T();
        C227802jw r1 = this.A20;
        AnonymousClass3JG r02 = new AnonymousClass3JG(r1, A012, A032, r4, userSession, A0H2, A0J2, A0T2, A0W2, r10, r1, r12, A0v2, A102);
        this.A1d = r02;
        return r02;
    }

    public final C230662pz A0n() {
        C230662pz r3 = this.A1e;
        if (r3 != null) {
            return r3;
        }
        C230662pz r32 = new C230662pz(this.A1t, this.A1x, this.A20);
        this.A1e = r32;
        return r32;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.07Z, X.2jw] */
    public final C228472lj A0o() {
        C228472lj r7 = this.A1f;
        if (r7 != null) {
            return r7;
        }
        Context context = this.A1s;
        UserSession userSession = this.A1t;
        ? r6 = this.A20;
        AnonymousClass4DU r11 = AnonymousClass2kO.A00;
        AnonymousClass2l3 A0Q2 = A0Q();
        C228182kv r5 = this.A1x;
        C228302lG A0R2 = A0R();
        C228052ki BIG = this.A1v.BIG();
        AnonymousClass2lC A0I2 = A0I();
        AnonymousClass2lH r2 = this.A0S;
        if (r2 == null) {
            r2 = new AnonymousClass2lH(userSession);
            this.A0S = r2;
        }
        AnonymousClass2lI r3 = (AnonymousClass2lI) this.A21.getValue();
        0gy A002 = AnonymousClass07i.A00(r6);
        C228312lJ A0f2 = A0f();
        C228322lL A0P2 = A0P();
        C228232l0 A0k2 = A0k();
        AnonymousClass2lT A0S2 = A0S();
        AnonymousClass2lZ r1 = this.A0Z;
        if (r1 == null) {
            r1 = new AnonymousClass2lZ(context, r11, userSession, new AnonymousClass2lX());
            this.A0Z = r1;
        }
        AnonymousClass2lH r19 = r2;
        AnonymousClass2lI r20 = r3;
        AnonymousClass2lZ r22 = r1;
        C228472lj r72 = new C228472lj(context, A002, userSession, r11, A0S2, A0I2, A0K(), A0P2, A0Q2, A0R2, BIG, r19, r20, A0f2, r22, A0k2, r5, r6, A0x());
        this.A1f = r72;
        return r72;
    }

    public final AnonymousClass35W A0p() {
        AnonymousClass35W r0 = this.A1g;
        if (r0 != null) {
            return r0;
        }
        C227802jw r6 = this.A20;
        C231002qi r4 = A0v().A05;
        AnonymousClass35V A0r2 = A0r();
        AnonymousClass35W r02 = new AnonymousClass35W(this.A1t, A08(), AnonymousClass2kO.A00, r4, this.A1x, r6, A0r2);
        this.A1g = r02;
        return r02;
    }

    public final C229142mu A0q() {
        C229142mu r2 = this.A1h;
        if (r2 != null) {
            return r2;
        }
        C229142mu r22 = new C229142mu(this.A1t, this.A20, this);
        this.A1h = r22;
        return r22;
    }

    public final AnonymousClass35V A0r() {
        AnonymousClass35V r1 = this.A1i;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass35V r12 = new AnonymousClass35V(this.A1t);
        this.A1i = r12;
        return r12;
    }

    public final C229112mr A0s() {
        C229112mr r3 = this.A1j;
        if (r3 != null) {
            return r3;
        }
        C229112mr r32 = new C229112mr(this.A1t, A0o(), A0o());
        this.A1j = r32;
        return r32;
    }

    public final AnonymousClass2o0 A0t() {
        AnonymousClass2o0 r1 = this.A1k;
        if (r1 != null) {
            return r1;
        }
        C227802jw r12 = this.A20;
        FragmentActivity requireActivity = r12.requireActivity();
        C229752ny r6 = this.A0O;
        if (r6 == null) {
            r6 = new C229752ny(r12, this.A1t);
            this.A0O = r6;
        }
        0wc r3 = this.A03;
        if (r3 == null) {
            r3 = AnonymousClass0kN.A01(AnonymousClass2kO.A00, this.A1t);
            this.A03 = r3;
        }
        AnonymousClass2o0 r13 = new AnonymousClass2o0(requireActivity, r3, this.A1t, this.A1v.BOL(), r6, AnonymousClass2kO.A00.getModuleName());
        this.A1k = r13;
        return r13;
    }

    public final C228192kw A0u() {
        C228192kw r2 = this.A1l;
        if (r2 != null) {
            return r2;
        }
        C228192kw r22 = new C228192kw(this.A1s, this.A1t);
        this.A1l = r22;
        return r22;
    }

    public final C230822qK A0v() {
        C230822qK r0 = this.A1m;
        if (r0 != null) {
            return r0;
        }
        C227802jw r5 = this.A20;
        C227872kC r4 = this.A1z;
        C230822qK r02 = new C230822qK(A0q().A00(), AnonymousClass2kO.A00, this.A1t, r4, r5);
        this.A1m = r02;
        return r02;
    }

    public final C238203Ay A0w() {
        C238203Ay r0 = this.A1n;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = this.A1t;
        Object value = A0r().A00.getValue();
        0qQ.A07(value);
        C2365134a A0O2 = A0O();
        AnonymousClass36M A0z2 = A0z();
        C227802jw r8 = this.A20;
        C238183Aw A0Y2 = A0Y();
        C228472lj A0o2 = A0o();
        C229112mr A0s2 = A0s();
        C238203Ay r02 = new C238203Ay(userSession, (C2370236a) value, A0O2, A0R(), A0Y2, A0f(), A0o2, r8, A0s2, A0z2);
        this.A1n = r02;
        return r02;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2le, X.2lf] */
    public final C228462li A0x() {
        C228462li r3 = this.A1o;
        if (r3 != null) {
            return r3;
        }
        C227802jw r2 = this.A20;
        UserSession userSession = this.A1t;
        C228422le r0 = this.A00;
        C228422le r02 = r0;
        if (r0 == null) {
            ? r03 = new C228432lf();
            this.A00 = r03;
            r02 = r03;
        }
        C228462li r32 = new C228462li(r02, userSession, r2);
        this.A1o = r32;
        return r32;
    }

    public final AnonymousClass365 A0y() {
        AnonymousClass365 r3 = this.A1p;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass365 r32 = new AnonymousClass365(this.A1t, this.A1w, this.A20);
        this.A1p = r32;
        return r32;
    }

    public final AnonymousClass36M A0z() {
        AnonymousClass36M r4 = this.A1q;
        if (r4 != null) {
            return r4;
        }
        AnonymousClass36M r42 = new AnonymousClass36M(this.A20, AnonymousClass2kO.A00, this.A1t, this.A1w);
        this.A1q = r42;
        return r42;
    }

    public final AnonymousClass354 A10() {
        AnonymousClass354 r3 = this.A1r;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass354 r32 = new AnonymousClass354(this.A1t, AnonymousClass2kO.A00, this.A20, this);
        this.A1r = r32;
        return r32;
    }
}
