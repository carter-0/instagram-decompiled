package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JjS  reason: case insensitive filesystem */
public final class C60323JjS extends 2YL implements C353998Kg, C66501MUf {
    public C59732JVq A00;
    public C61714KJf A01;
    public C61714KJf A02;
    public WeakReference A03;
    public boolean A04;
    public final C348257y9 A05;
    public final UserSession A06;
    public final 27r A07;
    public final C3499682q A08;
    public final AnonymousClass6SR A09;
    public final List A0A;
    public final C249513ju A0B;
    public final C249513ju A0C;
    public final C249513ju A0D;
    public final AnonymousClass0r6 A0E;
    public final AnonymousClass0r6 A0F;
    public final AnonymousClass0r6 A0G;
    public final AnonymousClass0r6 A0H;
    public final AnonymousClass0r6 A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final AnonymousClass0Ud A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final boolean A0R;
    public final C3499582p A0S;
    public final C249513ju A0T;

    public C60323JjS(UserSession userSession, 27r r14, C3499582p r15, C3499682q r16, AnonymousClass6SR r17, boolean z) {
        Integer num;
        MediaSession mediaSession;
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A0S = r15;
        this.A08 = r16;
        this.A0R = z;
        this.A09 = r17;
        this.A07 = r14;
        C3499682q r0 = r15.A00;
        if (r0 == null || (mediaSession = (MediaSession) 00k.A0J(r0.Co4())) == null) {
            num = null;
        } else {
            num = mediaSession.Bsu();
        }
        Integer num2 = AnonymousClass05K.A00;
        02z A10 = DbS.A10(new C59671JTb(AnonymousClass7TF.A1W(num, num2), 4));
        this.A0L = A10;
        this.A0Q = A10;
        1HR A1G = JTO.A1G(0);
        this.A0T = A1G;
        this.A0I = 0u9.A04(A1G);
        1HR A1G2 = JTO.A1G(0);
        this.A0D = A1G2;
        0sn r9 = 0sn.A00;
        02z A012 = 106.A01(r9);
        this.A0M = A012;
        02z A013 = 106.A01(r9);
        this.A0N = A013;
        02z A102 = DbS.A10(new C61080JwI((JVX) null, (DefaultConstructorMarker) null, 1, 34));
        this.A0K = A102;
        this.A0P = A102;
        this.A0G = 0u9.A04(A1G2);
        this.A0E = 10b.A02(new C60910JtU(r9, r9), C318116oQ.A00(this), AnonymousClass10H.A03(MIH.A00, A012, A013), AnonymousClass10A.A01);
        1HR A1G3 = JTO.A1G(0);
        this.A0B = A1G3;
        this.A0F = 0u9.A04(A1G3);
        02z A103 = DbS.A10(new C59721JVf(num2));
        this.A0J = A103;
        this.A0O = A103;
        this.A00 = new C59732JVq(7, 3, false, false);
        1HR A1G4 = JTO.A1G(0);
        this.A0C = A1G4;
        this.A0H = 0u9.A04(A1G4);
        this.A05 = new C64716Lgp(this, 1);
        C64934LkZ lkZ = new C64934LkZ(userSession);
        LinkedList<C63805L7l> A002 = C63125Krt.A00(userSession);
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        for (C63805L7l l7l : A002) {
            UserSession userSession2 = this.A06;
            0qQ.A0A(l7l);
            A0r.add(new C61714KJf(userSession2, l7l, lkZ));
        }
        this.A0A = A0r;
    }

    public final void A03(Context context, MediaSession mediaSession, C267834cI r12, boolean z, boolean z2) {
        0qQ.A0B(mediaSession, 0);
        UserSession userSession = this.A06;
        Context context2 = context;
        C59953JcJ.A01(userSession, context);
        C64168LRo A002 = C59953JcJ.A00(userSession);
        A002.A08(this.A0S);
        A002.A09(z);
        if (mediaSession.Bsu().intValue() != 0) {
            int A012 = C63994LHs.A01(context, false);
            GVC gvc = new GVC(context2, JTO.A0s(context.getExternalFilesDir((String) null), "icon_zero_frame.jpg"), JTQ.A0N(mediaSession, r12), A002, A012, 4);
            if (z2) {
                C51971G9r.A1Q(gvc, C318116oQ.A00(this), 19);
            } else {
                gvc.invoke();
            }
        } else {
            CropInfo Asr = mediaSession.Asr();
            if (Asr != null) {
                A002.A02(context, Asr, mediaSession.B2U().getValue(), false);
                A002.A05(context, mediaSession.B5g());
            }
        }
        CreationSession creationSession = ((JWE) this.A08).A01;
        List list = creationSession.A0E;
        if (!list.contains(mediaSession)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaSession A0Z = JTO.A0Z(it);
                if (A0Z.B5g().equals(mediaSession.B5g())) {
                    list.set(list.indexOf(A0Z), mediaSession);
                }
            }
            throw AnonymousClass7TE.A0z("MediaSession not contained in media session list");
        }
        creationSession.A07 = mediaSession;
        mediaSession.BpN().EK1();
    }

    public final void A07(Integer num, boolean z) {
        0qQ.A0B(num, 1);
        05G r2 = this.A0J;
        C66534MVo mVo = (C66534MVo) ((C59721JVf) r2.getValue()).A00;
        if (mVo != null) {
            mVo.CuZ(z);
        }
        do {
        } while (!r2.AIY(r2.getValue(), new C59721JVf(num)));
    }

    public final void Drb(L02 l02) {
    }

    public final void Drc(C60060Jeb jeb) {
        PhotoFilter photoFilter;
        0qQ.A0B(jeb, 0);
        C61714KJf kJf = this.A02;
        if (kJf == null || (photoFilter = (PhotoFilter) kJf.A01.getValue()) == null) {
            C61714KJf kJf2 = this.A01;
            if (kJf2 != null) {
                photoFilter = (PhotoFilter) kJf2.A01.getValue();
            } else {
                photoFilter = null;
            }
        }
        C66534MVo A012 = C66568MWw.A01(jeb.A05);
        if (A012 != null && A012.CNF(jeb, photoFilter)) {
            Drd(jeb, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        if (X.C66568MWw.A00(r6) != 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d8, code lost:
        if (X.C66568MWw.A00(r6) != 0) goto L_0x009d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017f A[LOOP:3: B:47:0x0179->B:49:0x017f, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Drd(X.C60060Jeb r13, boolean r14) {
        /*
            r12 = this;
            r7 = 0
            X.0qQ.A0B(r13, r7)
            r13.invalidate()
            X.Jez r6 = r13.A05
            X.MWw r5 = r6.A01
            X.0qQ.A07(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.album.AlbumFilterInfo"
            X.0qQ.A0C(r5, r0)
            X.KJf r5 = (X.C61714KJf) r5
            X.6SR r8 = r12.A09
            X.L7l r0 = r5.A00
            int r0 = r0.A00
            r8.A03 = r0
            X.MVo r4 = X.C66568MWw.A01(r6)
            X.LkZ r4 = (X.C64934LkZ) r4
            if (r4 == 0) goto L_0x0194
            X.82q r0 = r12.A08
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            java.util.List r0 = r0.A05()
            java.util.ArrayList r2 = X.DbV.A15(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r1.next()
            com.instagram.creation.base.PhotoSession r0 = (com.instagram.creation.base.PhotoSession) r0
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A07
            if (r0 == 0) goto L_0x0037
            r2.add(r0)
            goto L_0x0037
        L_0x004b:
            java.lang.ref.WeakReference r0 = r12.A03
            if (r0 == 0) goto L_0x00db
            java.lang.Object r0 = r0.get()
            X.4cI r0 = (X.C267834cI) r0
        L_0x0055:
            java.util.List r0 = r12.A02(r0)
            r4.A03 = r12
            r4.A04 = r2
            r4.A05 = r0
            X.MWw r0 = r6.A01
            X.0qQ.A07(r0)
            X.KJf r0 = (X.C61714KJf) r0
            X.0eM r0 = r0.A01
            java.lang.Object r3 = r0.getValue()
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r3 = (com.instagram.creation.photo.edit.effectfilter.PhotoFilter) r3
            int r2 = X.C66568MWw.A00(r6)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r0 = r3.A03
            float r1 = r0.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            android.util.SparseIntArray r0 = r4.A06
            int r0 = r0.get(r2, r1)
            r4.A01 = r0
            com.instagram.common.session.UserSession r0 = r4.A07
            boolean r0 = X.2Ht.A02(r0)
            r2 = 1
            if (r0 == 0) goto L_0x00cc
            X.Jeb r0 = r4.A02
            if (r0 == 0) goto L_0x00de
            int r1 = r4.A00
            int r0 = X.C66568MWw.A00(r6)
            if (r1 != r0) goto L_0x00de
            int r0 = X.C66568MWw.A00(r6)
            if (r0 == 0) goto L_0x0194
        L_0x009d:
            if (r14 == 0) goto L_0x019a
            X.0eM r0 = r5.A01
            java.lang.Object r6 = r0.getValue()
            X.05G r5 = r12.A0J
        L_0x00a7:
            java.lang.Object r3 = r5.getValue()
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.JVf r0 = new X.JVf
            r0.<init>((X.C66534MVo) r4, (java.lang.Integer) r1)
            boolean r0 = r5.AIY(r3, r0)
            if (r0 == 0) goto L_0x00a7
            if (r6 == 0) goto L_0x019a
            r8.A0N = r2
            X.27r r2 = r12.A07
            X.4yP r0 = r2.A0J()
            if (r0 == 0) goto L_0x019a
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "FEED_COLOR_FILTER_STRENGTH_ALL_CAROUSEL_TAP"
            X.27r.A08(r1, r2, r0, r7)
            return
        L_0x00cc:
            int r1 = r4.A00
            int r0 = X.C66568MWw.A00(r6)
            if (r1 != r0) goto L_0x00de
            int r0 = X.C66568MWw.A00(r6)
            if (r0 == 0) goto L_0x00de
            goto L_0x009d
        L_0x00db:
            r0 = 0
            goto L_0x0055
        L_0x00de:
            X.Jeb r0 = r4.A02
            if (r0 == 0) goto L_0x00e5
            r0.setChecked(r7)
        L_0x00e5:
            int r8 = r3.A08
            boolean r0 = X.AnonymousClass7TF.A1P(r8)
            r13.setShouldShowSlidersIcon(r0)
            r13.setChecked(r2)
            r13.refreshDrawableState()
            r4.A02 = r13
            int r0 = X.C66568MWw.A00(r6)
            r4.A00 = r0
            java.util.List r0 = r4.A04
            java.util.Iterator r11 = r0.iterator()
        L_0x0102:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x016f
            java.lang.Object r9 = r11.next()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r9 = (com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel) r9
            java.lang.String r0 = "AlbumEffectAdjustmentController_onSelectForAlbum()"
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r1 = X.C394999z2.A00(r9, r0)
            int r0 = r4.A01
            r3.A00(r0)
            if (r1 == 0) goto L_0x0133
            int r0 = r1.A01
            r3.A01 = r0
            boolean r0 = r3.A06
            r3.A06 = r0
            int r0 = r1.A02
            r3.A02 = r0
            float r0 = r1.A00
            r3.A00 = r0
            boolean r0 = r1.A06
            r3.A06 = r0
            boolean r0 = r1.A04
            r3.A04 = r0
        L_0x0133:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r1 = r3.A03
            java.lang.String r0 = X.C366508p8.A01(r8)
            java.lang.String r10 = "normal"
            boolean r0 = r10.equals(r0)
            r0 = r0 ^ 1
            r1.A02 = r0
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r3.writeToParcel(r0, r7)
            r0.setDataPosition(r7)
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r2 = new com.instagram.creation.photo.edit.effectfilter.PhotoFilter
            r2.<init>(r0)
            r0 = r9
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = (com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl) r0
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0169
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter r1 = r2.A03
            int r0 = r2.A08
            java.lang.String r0 = X.C366508p8.A01(r0)
            boolean r0 = r10.equals(r0)
            r0 = r0 ^ 1
            r1.A02 = r0
        L_0x0169:
            r0 = 17
            r9.EWk(r2, r0)
            goto L_0x0102
        L_0x016f:
            int r3 = X.C66568MWw.A00(r6)
            java.util.List r0 = r4.A05
            java.util.Iterator r2 = r0.iterator()
        L_0x0179:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x018c
            X.3Q2 r0 = X.JTO.A0m(r2)
            X.3QG r1 = r0.A1i
            r1.A01 = r3
            int r0 = r4.A01
            r1.A00 = r0
            goto L_0x0179
        L_0x018c:
            X.8Kg r0 = r4.A03
            r0.getClass()
            r0.EEp()
        L_0x0194:
            X.KJf r0 = r12.A01
            if (r0 != 0) goto L_0x019b
            r12.A01 = r5
        L_0x019a:
            return
        L_0x019b:
            r12.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60323JjS.Drd(X.Jeb, boolean):void");
    }

    public static C59721JVf A00(AlbumEditFragment albumEditFragment) {
        return (C59721JVf) ((C60323JjS) albumEditFragment.A0f.getValue()).A0O.getValue();
    }

    public static boolean A01(AlbumEditFragment albumEditFragment) {
        UserSession userSession = ((C60323JjS) albumEditFragment.A0f.getValue()).A06;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328590031338949L) || 182.A06(r2, userSession, 36328590031404486L)) {
            return true;
        }
        return false;
    }

    public final List A02(C267834cI r4) {
        AnonymousClass3Q2 BbQ;
        List<VideoSession> FN1 = this.A08.FN1();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (VideoSession videoSession : FN1) {
            if (!(r4 == null || (BbQ = r4.BbQ(videoSession.A0G)) == null)) {
                A1C.add(BbQ);
            }
        }
        return A1C;
    }

    public final void A04(AnonymousClass4DH r7, Map map) {
        AnonymousClass4DH r0 = r7;
        Map map2 = map;
        C63197Kt4.A00(r0, this.A06, this.A08, map2, new C66218MIz(this, 22), new MP4(this, 8));
    }

    public final void A06(Integer num) {
        05G r2 = this.A0J;
        do {
        } while (!r2.AIY(r2.getValue(), new C59721JVf(num)));
        29Z r22 = this.A07.A0F;
        0Aj A0d = JTR.A0d(r22);
        if (A0d.isSampled()) {
            JTO.A1O(AnonymousClass80P.COLOR_FILTERS, A0d);
            JTO.A1S(A0d, JTP.A0p(r22.A04));
            JTP.A1H(A0d);
            AnonymousClass7TH.A0U(A0d);
            JTP.A1F(A0d);
            A0d.Cgf();
        }
    }

    public final void EEp() {
        this.A0T.FIG(new Object());
    }

    public final void A05(C267834cI r3, boolean z) {
        Iterator it = A02(r3).iterator();
        while (it.hasNext()) {
            JTO.A0m(it).A5F = z;
        }
    }
}
