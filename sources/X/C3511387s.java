package X;

import android.app.Application;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.87s  reason: invalid class name and case insensitive filesystem */
public final class C3511387s extends C361478gI {
    public int A00;
    public int A01;
    public 28D A02;
    public 293 A03;
    public C270564gw A04;
    public ClipsTemplateModel A05;
    public Medium A06;
    public C390839rv A07;
    public AnonymousClass831 A08;
    public User A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public 05G A0D;
    public boolean A0E;
    public boolean A0F;
    public final 2Fk A0G;
    public final 2Fk A0H;
    public final C3511587u A0I;
    public final AnonymousClass882 A0J;
    public final UserSession A0K;
    public final ClipsCreationViewModel A0L;
    public final C3511187q A0M;
    public final C249513ju A0N;
    public final AnonymousClass0r6 A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final AnonymousClass0Ud A0T;
    public final Application A0U;
    public final 05G A0V;

    /* JADX WARNING: type inference failed for: r0v16, types: [X.109, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3511387s(Application application, C3511587u r8, AnonymousClass882 r9, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C3511187q r12) {
        super(application);
        int i;
        List BrX;
        0qQ.A0B(clipsCreationViewModel, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r9, 6);
        this.A0U = application;
        this.A0K = userSession;
        this.A0L = clipsCreationViewModel;
        this.A0I = r8;
        this.A0M = r12;
        this.A0J = r9;
        C270564gw r0 = this.A04;
        if (r0 == null || (BrX = r0.BrX()) == null) {
            i = 0;
        } else {
            i = BrX.size();
        }
        this.A0D = 106.A01(Integer.valueOf(i));
        02z A012 = 106.A01((Object) null);
        this.A0Q = A012;
        19B r1 = 19B.A00;
        this.A0H = C226292g8.A00(r1, A012);
        02z A013 = 106.A01((Object) null);
        this.A0P = A013;
        this.A0G = C226292g8.A00(r1, A013);
        02z A014 = 106.A01(0sn.A00);
        this.A0V = A014;
        this.A0T = 10b.A03(A014);
        1HR r02 = new 1HR(0);
        this.A0N = r02;
        this.A0O = 10b.A01(C318116oQ.A00(this), 0u9.A04(r02), new Object(), 1);
        this.A0R = new 02z(false);
        this.A0S = new 02z(AnonymousClass883.UNINITIALIZED);
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 41), r8.A04));
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new C376959Jz(this, (AnonymousClass4D7) null, 42), r9.A05));
    }

    public static final void A00(C3511387s r12) {
        C290815g0 A042 = C59730JVo.A04(r12.A0U.getApplicationContext(), r12.A0K, new C11211SFl(r12.A0B, "ClipsTemplateViewModel", true, false, false), -1, false);
        r12.A0P.Epw((Object) null);
        A042.A00 = new C385799jY(r12);
        1ES.A05(A042, 1365845790, 1, true, false);
    }

    public static final void A01(C3511387s r9) {
        05G r8;
        0sn arrayList;
        Integer valueOf;
        AnonymousClass51M r2;
        C270564gw r0 = r9.A04;
        if (r0 != null) {
            List BrX = r0.BrX();
            if ((!r9.A0N() || r9.A0A == null) && r9.A01 < BrX.size()) {
                int i = r9.A01;
                if (i == 0) {
                    r8 = r9.A0V;
                    arrayList = 00k.A0i(BrX, C229632nm.A0C(i, BrX.size()));
                } else {
                    AnonymousClass831 r1 = (AnonymousClass831) r9.A0L.A0c.getValue();
                    0qQ.A0B(r1, 0);
                    ArrayList A052 = r1.A05();
                    0qQ.A0C(A052, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.video.model.IgClipSegment>");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = A052.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                break;
                            }
                            AnonymousClass51N r22 = (AnonymousClass51N) next;
                            if (!(r22 instanceof AnonymousClass51M) || (r2 = (AnonymousClass51M) r22) == null || (valueOf = r2.A0G) == null) {
                                valueOf = Integer.valueOf(i2);
                            }
                            arrayList2.add(valueOf);
                            i2 = i3;
                        } else {
                            r8 = r9.A0V;
                            arrayList = new ArrayList();
                            int i4 = 0;
                            for (Object next2 : BrX) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    if (!arrayList2.contains(Integer.valueOf(i4))) {
                                        arrayList.add(next2);
                                    }
                                    i4 = i5;
                                }
                            }
                        }
                    }
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                r8 = r9.A0V;
                arrayList = 0sn.A00;
            }
            r8.Epw(arrayList);
            r9.A0Q.Epw(AnonymousClass8YK.GALLERY);
            r9.A0S.Epw(AnonymousClass883.PAUSED);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A0E() {
        this.A0S.Epw(AnonymousClass883.LOADING);
        this.A0Q.Epw(AnonymousClass8YK.SELECTED_SEGMENTS_TIMELINE);
        this.A0I.A01();
    }

    public final void A0F() {
        AnonymousClass8YK r0;
        05G r1;
        AnonymousClass883 r02;
        05G r2 = this.A0Q;
        if (r2.getValue() == AnonymousClass8YK.GALLERY) {
            if (this.A00 > 0) {
                A0E();
                this.A0M.A00();
            } else {
                if (this.A0E) {
                    r2.Epw(AnonymousClass8YK.EMPTY_TIMELINE);
                    r1 = this.A0S;
                } else {
                    if (A0K()) {
                        r0 = AnonymousClass8YK.LANDING_PAGE;
                    } else {
                        r0 = AnonymousClass8YK.EMPTY_TIMELINE;
                    }
                    r2.Epw(r0);
                    r1 = this.A0S;
                    if (A0K()) {
                        r02 = AnonymousClass883.LANDING_PAGE_PLAYBACK;
                        r1.Epw(r02);
                    }
                }
                r02 = AnonymousClass883.BUILDER_PLAYBACK;
                r1.Epw(r02);
            }
        }
        this.A0A = null;
    }

    public final boolean A0I() {
        List<C279454yf> BrX;
        C270564gw r0 = this.A04;
        if (r0 == null || (BrX = r0.BrX()) == null) {
            return false;
        }
        if ((BrX instanceof Collection) && BrX.isEmpty()) {
            return false;
        }
        for (C279454yf A032 : BrX) {
            if (AnonymousClass8YL.A03(A032)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0J() {
        int i;
        Integer BT9;
        int i2 = this.A00;
        if (i2 < 1) {
            return false;
        }
        C270564gw r0 = this.A04;
        if (r0 == null || (BT9 = r0.BT9()) == null) {
            i = 3;
        } else {
            i = BT9.intValue();
        }
        if (i2 >= i) {
            return true;
        }
        return false;
    }

    public final boolean A0K() {
        if (this.A04 != null) {
            if (!182.A06(0Tu.A05, this.A0K, 36322164760127464L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A0L() {
        if (this.A04 == null || ((A0N() && this.A0A != null) || this.A07 == C390839rv.POST_CAPTURE)) {
            return false;
        }
        return true;
    }

    public final boolean A0M() {
        if (this.A04 != null) {
            2Fk r2 = this.A0H;
            if (r2.A02() == AnonymousClass8YK.LANDING_PAGE || r2.A02() == null) {
                if (!182.A06(0Tu.A05, this.A0K, 36322164760127464L)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A0N() {
        if (this.A04 == null || this.A07 == C390839rv.POST_CAPTURE) {
            return false;
        }
        return true;
    }

    public final void A0G(boolean z) {
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new JV6((Object) this, (AnonymousClass4D7) null, 17, z), A002);
    }

    public final boolean A0H() {
        if (A0M()) {
            if (!182.A06(0Tu.A05, this.A0K, 36322164760258538L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
