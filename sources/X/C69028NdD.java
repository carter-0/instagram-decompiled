package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteCreationSource;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.NdD  reason: case insensitive filesystem */
public final class C69028NdD extends MYL implements C13907Tl7 {
    public Runnable A00;
    public C262204Co A01;
    public final UserSession A02;
    public final C71144Ody A03;
    public final FriendMapLaunchConfig A04;
    public final FriendMapRepository A05;
    public final C71035OZw A06;
    public final OI3 A07;
    public final 1Wr A08 = 1Wr.A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.OI3] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C69028NdD(com.instagram.common.session.UserSession r29, X.C71144Ody r30, com.instagram.friendmap.configs.FriendMapLaunchConfig r31, com.instagram.friendmap.data.FriendMapRepository r32, X.C71035OZw r33) {
        /*
            r28 = this;
            r13 = 1
            r8 = r29
            X.0qQ.A0B(r8, r13)
            r7 = r30
            r6 = r32
            r3 = r33
            X.C51974G9v.A1M(r6, r3, r7)
            r11 = 0
            X.0sl r2 = X.0sl.A00
            X.0sn r1 = X.0sn.A00
            r12 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r10 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r9 = new X.Gmr
            r14 = r12
            r15 = r12
            r16 = r13
            r17 = r12
            r18 = r12
            r19 = r13
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r13
            r24 = r12
            r25 = r13
            r26 = r12
            r27 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.NdI r5 = X.C69031NdI.A00
            X.N8r r0 = new X.N8r
            r0.<init>(r5, r9, r1, r2)
            r4 = r28
            r4.<init>(r0)
            r4.A02 = r8
            r4.A05 = r6
            r4.A06 = r3
            r4.A03 = r7
            r0 = r31
            r4.A04 = r0
            X.1Wr r0 = X.1Wr.A00
            r4.A08 = r0
            r0 = -1
            X.OI3 r2 = new X.OI3
            r2.<init>()
            r2.A09 = r12
            r2.A05 = r11
            r2.A08 = r13
            r2.A02 = r11
            r2.A06 = r11
            r2.A04 = r11
            r2.A00 = r0
            r2.A07 = r12
            r2.A01 = r11
            r2.A03 = r11
            r4.A07 = r2
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 28
            X.MG8 r0 = new X.MG8
            r0.<init>(r4, r11, r1)
            X.19B r3 = X.19B.A00
            X.1Eo.A05(r3, r0, r2)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 30
            X.MG8 r0 = new X.MG8
            r0.<init>(r4, r11, r1)
            X.1Eo.A05(r3, r0, r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.PkW r0 = X.C73833PkW.A00
            A0B(r11, r4, r1, r0, r12)
            A0F(r5, r4)
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 29
            X.Pfo r0 = new X.Pfo
            r0.<init>(r4, r11, r1)
            X.1Eo.A05(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69028NdD.<init>(com.instagram.common.session.UserSession, X.Ody, com.instagram.friendmap.configs.FriendMapLaunchConfig, com.instagram.friendmap.data.FriendMapRepository, X.OZw):void");
    }

    public static final OIR A05(Location location, AnonymousClass4AB r17) {
        C279864zZ r4;
        Double d;
        List list;
        AnonymousClass913 r0;
        C279864zZ BWY;
        C300845y2 r2;
        Double d2 = null;
        AnonymousClass4AB r02 = r17;
        if (r17 == null || (list = r02.A0J) == null || (r0 = (AnonymousClass913) 00k.A0J(list)) == null || (BWY = r0.BWY()) == null) {
            r4 = null;
        } else {
            C300845y2 r1 = BWY.A0A;
            if (r1 != null) {
                r2 = new C300845y2(r1.A00, r1.A01, r1.A02, r1.A03, r1.A04, r1.A05, r1.A06, r1.A07, r1.A08, (AnonymousClass60C) null, r1.A0A, r1.A0B, r1.A0C);
            } else {
                r2 = null;
            }
            C45463Cwu cwu = new C45463Cwu(BWY);
            cwu.A0A = r2;
            r4 = cwu.A01();
        }
        if (location != null) {
            d = Double.valueOf(location.getLatitude());
            d2 = Double.valueOf(location.getLongitude());
        } else {
            d = null;
        }
        return C71047OaP.A02((NotePogVideoDict) null, r4, d, d2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (X.AnonymousClass3HF.A03(r4) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (X.AnonymousClass3HF.A03(r2.A02) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53367Gmr A07(X.O93 r15, X.C69028NdD r16, int r17, boolean r18, boolean r19) {
        /*
            r3 = r15
            boolean r0 = r15 instanceof X.C69030NdG
            if (r0 == 0) goto L_0x0021
            r2 = 0
            r3 = 0
            r7 = 1
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r0 = new X.Gmr
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r9 = r3
            r10 = r7
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r7
            r15 = r3
            r16 = r7
            r17 = r3
            r18 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0021:
            boolean r0 = r15 instanceof X.NdH
            r2 = r16
            if (r0 == 0) goto L_0x005b
            X.OZw r1 = r2.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.JVq r0 = r1.A02(r0)
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x003c
            com.instagram.common.session.UserSession r0 = r2.A02
            boolean r0 = X.AnonymousClass3HF.A03(r0)
            r5 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            X.NdH r3 = (X.NdH) r3
            boolean r15 = r3.A04
            r2 = 0
            r4 = 1
            r3 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r0 = new X.Gmr
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r4
            r11 = r3
            r12 = r4
            r13 = r4
            r14 = r4
            r16 = r4
            r17 = r15
            r18 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x005b:
            boolean r0 = r15 instanceof X.NdF
            if (r0 == 0) goto L_0x007b
            r2 = 0
            r4 = 1
            r3 = 0
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r0 = new X.Gmr
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r4
            r11 = r3
            r12 = r3
            r13 = r4
            r14 = r4
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x007b:
            com.instagram.common.session.UserSession r4 = r2.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321769623987931(0x810a75000d26db, double:3.0333715940123624E-306)
            boolean r6 = X.182.A06(r3, r4, r0)
            r12 = 0
            r0 = 36321769624381153(0x810a75001326e1, double:3.0333715942610375E-306)
            boolean r8 = X.182.A06(r3, r4, r0)
            X.OZw r1 = r2.A06
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.JVq r0 = r1.A02(r0)
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00a5
            boolean r0 = X.AnonymousClass3HF.A03(r4)
            r5 = 1
            if (r0 != 0) goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            r0 = 36321769626937087(0x810a75003a26ff, double:3.0333715958774205E-306)
            boolean r11 = X.C51965G9l.A1a(r3, r4, r0)
            r14 = r18 ^ 1
            boolean r15 = X.182.A06(r3, r4, r0)
            boolean r18 = r2.A0M()
            X.N2q r2 = r2.A0S()
            r4 = 1
            com.instagram.direct.inbox.notes.models.NoteAudience r1 = com.instagram.direct.inbox.notes.models.NoteAudience.MUTUAL_FOLLOWERS
            X.Gmr r0 = new X.Gmr
            r3 = r17
            r9 = r19
            r7 = r4
            r10 = r4
            r13 = r12
            r16 = r4
            r17 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69028NdD.A07(X.O93, X.NdD, int, boolean, boolean):X.Gmr");
    }

    public static final void A09(C69486NmU nmU, C69028NdD ndD, Integer num, C62320sa r14) {
        String str;
        String str2;
        C69028NdD ndD2 = ndD;
        C71035OZw oZw = ndD.A06;
        Integer num2 = num;
        C59732JVq A022 = oZw.A02(num);
        C62320sa r9 = r14;
        if (A022.A00) {
            C58699Iw8 iw8 = new C58699Iw8(9, num2, r9, ndD2, nmU);
            Activity activity = oZw.A00;
            C346927vz A002 = 1DL.A00(activity, AnonymousClass000.A00(27));
            0qQ.A07(A002);
            if (!A002.A00) {
                1Av r4 = (1Av) oZw.A03.getValue();
                if (!AnonymousClass7TG.A1a(r4, r4.A1M, 1Av.A8a, 497)) {
                    C58185Inp inp = new C58185Inp(2, iw8, oZw);
                    C58179Inj inj = new C58179Inj(iw8, 23);
                    UserSession userSession = oZw.A01;
                    if (AnonymousClass3HF.A03(userSession)) {
                        str = "friend_map_location_sharing_device_permissions";
                    } else {
                        str = "location_device_permission";
                    }
                    boolean equals = str.equals("friend_map_location_sharing_device_permissions");
                    if (equals) {
                        oZw.A02.A09(C54671HOc.PRE_LOCATION_PERMISSIONS_NUX);
                    }
                    OJO A003 = C69714Nqa.A00(userSession);
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        str2 = "ig_friend_map_note_create";
                    } else if (intValue == 3) {
                        str2 = "";
                    } else if (intValue != 1) {
                        str2 = "ig_friend_map_center";
                    } else {
                        str2 = "ig_friend_map_launch";
                    }
                    A003.A00(activity, new NC2(oZw, inp, inj, equals), str, str2, (String) null, (String) null, (String) null);
                    return;
                }
            }
            C71035OZw.A00(oZw, iw8);
        } else if (A022.A01) {
            r14.invoke();
        } else if (A022.A02) {
            ndD.A0C(nmU, num, r14);
        }
    }

    public static final void A0B(C69486NmU nmU, C69028NdD ndD, Integer num, C62320sa r5, boolean z) {
        ndD.A00 = null;
        C71035OZw oZw = ndD.A06;
        if (oZw.A02(num).A01) {
            ndD.A0L(new GN2(16, ndD, r5, z), z);
        } else if (oZw.A02(num).A02) {
            ndD.A0C(nmU, num, r5);
        } else if (num == AnonymousClass05K.A01) {
            ndD.A0P(PH3.A00);
        }
    }

    private final void A0C(C69486NmU nmU, Integer num, C62320sa r16) {
        boolean z;
        long j;
        C62320sa r8;
        C62320sa r7;
        Integer num2;
        Integer num3 = num;
        int intValue = num.intValue();
        C69486NmU nmU2 = nmU;
        C62320sa r3 = r16;
        if (intValue == 0) {
            num2 = AnonymousClass05K.A01;
            r7 = new C58699Iw8(10, num3, r3, this, nmU);
            nmU2 = C69486NmU.NOTE_CREATE_BUTTON;
            j = 0;
            z = true;
            r8 = C73834PkX.A00;
        } else if (intValue != 3) {
            C71035OZw oZw = this.A06;
            C58695Iw4 iw4 = new C58695Iw4(15, (Object) num, (Object) this, (Object) r3);
            Activity activity = oZw.A00;
            if (!activity.isFinishing()) {
                W38.A04(activity, (Drawable) null, new RBD(iw4, 0), (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2131965506, oZw.A02(AnonymousClass05K.A01).A01, false);
                return;
            }
            return;
        } else {
            num2 = AnonymousClass05K.A0C;
            r7 = new C73662Phb(this, 10);
            r8 = new C73662Phb(this, 11);
            j = 0;
            z = true;
        }
        A0A(nmU2, this, num2, r7, r8, j, z);
    }

    public static final void A0D(LatLng latLng, C69028NdD ndD) {
        0sP r6;
        C69028NdD ndD2 = ndD;
        O93 A012 = MYL.A01(ndD);
        LatLng latLng2 = latLng;
        if (A012 instanceof NdH) {
            LatLng A042 = A04(ndD);
            if (A042 != null) {
                double A002 = A042.A00(latLng);
                UserSession userSession = ndD.A02;
                0Tu r2 = 0Tu.A05;
                if (!182.A06(r2, userSession, 2342164778839582449L) || A002 <= 182.A00(r2, userSession, 37166194555879851L)) {
                    r6 = new C58766IxD(16, ndD2, latLng2, A012, true);
                } else {
                    N4t n4t = ((NdH) A012).A02;
                    ndD.A0P(new C72719PGz(n4t.A04, 15.0f, false, true));
                    ndD.A0P(new PGp(n4t));
                    ndD.A0P(PH8.A00);
                    return;
                }
            } else {
                return;
            }
        } else if (A012 instanceof NdF) {
            r6 = new GN2(17, A012, latLng, true);
        } else {
            return;
        }
        ndD.A0R(r6);
    }

    public static final void A0E(C53396GnT gnT, C69028NdD ndD, String str, boolean z) {
        long j;
        C74260Pro pha;
        C69028NdD ndD2 = ndD;
        UserSession userSession = ndD2.A02;
        C53396GnT gnT2 = gnT;
        N3Q A032 = C71130OdT.A03(gnT2, userSession);
        if (A032 != null) {
            N4t A022 = C71130OdT.A02(A032);
            O93 A012 = MYL.A01(ndD2);
            OI3 oi3 = ndD2.A07;
            oi3.A00 = System.currentTimeMillis();
            String str2 = str;
            if (A012 instanceof NdH) {
                ndD2.A0R(new C58811Ixw(gnT2, ndD2, true, A022.A05, A012, (Object) null, str2, 0));
                return;
            }
            0Tu r4 = 0Tu.A05;
            C53396GnT gnT3 = gnT2;
            N4t n4t = A022;
            String str3 = str2;
            A0F(new NdH(gnT3, n4t, str3, ndD2.A00(), 182.A06(r4, userSession, 2342164778839582449L), true, z), ndD2);
            if (A012 instanceof C69029NdE) {
                pha = PH3.A00;
                j = 150;
            } else {
                j = 150;
                pha = new PHA(true, C73832PkV.A00);
            }
            ndD2.A0Q(pha, j);
            LatLng A042 = A04(ndD2);
            if (A042 != null) {
                oi3.A02 = null;
                if (182.A06(r4, userSession, 2342164778839582449L)) {
                    A08(A03(ndD2), ndD2, (float) ndD2.A00(), 0, false, false, false);
                    ndD2.A0Q(new C72712PGs(A042, 182.A00(r4, userSession, 37166194555879851L)), 0);
                    return;
                }
                A08(A03(ndD2), ndD2, 15.0f, 0, true, false, false);
            }
        }
    }

    public static final void A0F(O93 o93, C69028NdD ndD) {
        ndD.A0R(new MPB(5, (Object) o93, (Object) ndD));
    }

    public static final void A0I(C69028NdD ndD, long j) {
        C70290O0u.A00(ndD, new C66181MGs(ndD, (AnonymousClass4D7) null, 42), j);
    }

    public final void A0Z(String str) {
        NdH ndH;
        O93 A012 = MYL.A01(this);
        AnonymousClass4AB r6 = null;
        if ((A012 instanceof NdH) && (ndH = (NdH) A012) != null) {
            C53396GnT gnT = ndH.A01;
            NoteAudience noteAudience = (NoteAudience) gnT.A01;
            NoteStyle noteStyle = (NoteStyle) gnT.A05;
            NoteCreationSource noteCreationSource = (NoteCreationSource) gnT.A03;
            List list = (List) gnT.A04;
            DbZ.A0t(1, noteAudience, noteStyle, noteCreationSource);
            0qQ.A0B(list, 5);
            C53396GnT gnT2 = new C53396GnT(noteAudience, (C68176N3r) gnT.A02, noteCreationSource, noteStyle, str, list, true);
            N3Q A032 = C71130OdT.A03(gnT2, this.A02);
            if (A032 != null) {
                r6 = C71130OdT.A02(A032).A05;
            }
            A0R(new C58811Ixw(gnT2, this, false, r6, ndH, (Object) null, (String) null, 0));
        }
    }

    public final void A0a(String str) {
        Object obj;
        C74260Pro pGu;
        0qQ.A0B(str, 0);
        Iterator A022 = MYL.A02(this);
        do {
            obj = null;
            if (!A022.hasNext()) {
                break;
            }
            obj = A022.next();
        } while (!0qQ.A0K(((N4t) obj).A0B, str));
        N4t n4t = (N4t) obj;
        if (n4t != null) {
            if (n4t.A05 != null) {
                pGu = new PHA(true, new C58185Inp(32, n4t, this));
            } else {
                boolean z = n4t.A0J;
                C71144Ody ody = this.A03;
                User user = n4t.A06;
                String id = user.getId();
                if (z) {
                    ody.A0D(id);
                    A0W(C69486NmU.SELF_LOCATION_POG, false);
                    return;
                }
                ody.A0D(id);
                String str2 = n4t.A0A;
                if (str2 == null) {
                    str2 = user.getId();
                }
                pGu = new C72714PGu(str, str2);
            }
            A0P(pGu);
        }
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r14) {
        0qQ.A0B(r14, 0);
        OI3 oi3 = this.A07;
        boolean z = oi3.A09;
        oi3.A09 = false;
        if (z) {
            C70290O0u.A00(this, new C66181MGs(this, (AnonymousClass4D7) null, 43), 400);
            if (!AnonymousClass7TF.A1Y(oi3.A05, false) && C66580MXl.A1b(((C68280N8r) A0O()).A03)) {
                A0G(this);
            }
        }
        C17368VSv vSv = oi3.A02;
        if (vSv != null) {
            oi3.A02 = null;
            Location location = new Location("friend_map_coordinate");
            C17367VSu vSu = vSv.A01;
            location.setLatitude(vSu.A00);
            location.setLongitude(vSu.A01);
            A08(location, this, vSv.A00, 0, false, false, false);
        }
        if ((MYL.A01(this) instanceof C69031NdI) && this.A06.A02(AnonymousClass05K.A00).A01) {
            A0R(new C59100J6i(this, 45));
        }
        A0b((List) null);
        FriendMapRepository friendMapRepository = this.A05;
        if (AnonymousClass3HF.A04(friendMapRepository.A06)) {
            friendMapRepository.A03 = C51966G9m.A1L(new MGA(friendMapRepository, (AnonymousClass4D7) null, 20), friendMapRepository.A01);
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final void onStop(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        OI3 oi3 = this.A07;
        oi3.A02 = oi3.A01;
    }

    private final int A00() {
        UserSession userSession = this.A02;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36321769627789066L)) {
            return 3;
        }
        return (int) (18.0d - (Math.log((3.0d * 182.A00(r6, userSession, 37166194555879851L)) / 1000.0d) / Math.log(2.0d)));
    }

    public static final Location A03(C69028NdD ndD) {
        1Wr r2 = ndD.A08;
        if (r2 != null) {
            return r2.getLastLocation(ndD.A02, "FriendMapViewModel");
        }
        return null;
    }

    public static final void A08(Location location, C69028NdD ndD, float f, long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (location != null) {
            C69028NdD ndD2 = ndD;
            if (ndD.A07.A02 == null) {
                O93 A012 = MYL.A01(ndD);
                if (z2 || ((A012 instanceof NdH) && ((NdH) A012).A06)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ndD.A0Q(new C72719PGz(new LatLng(location.getLatitude(), location.getLongitude()), f, z, z4), j);
                if (z3) {
                    C71035OZw oZw = ndD.A06;
                    if (!oZw.A05() && oZw.A04() && AnonymousClass3HF.A03(ndD.A02)) {
                        A0A(C69486NmU.SELF_LOCATION_POG, ndD2, AnonymousClass05K.A0N, new C73898PlZ(ndD2, 44), new C73898PlZ(ndD2, 45), 0, true);
                    }
                }
            }
        }
    }

    public static final void A0A(C69486NmU nmU, C69028NdD ndD, Integer num, C62320sa r6, C62320sa r7, long j, boolean z) {
        if (C56317HwU.A01(ndD.A02, num)) {
            PagerSheetLaunchConfig pagerSheetLaunchConfig = new PagerSheetLaunchConfig(num);
            pagerSheetLaunchConfig.A01 = new C58185Inp(33, r7, ndD);
            pagerSheetLaunchConfig.A02 = r6;
            pagerSheetLaunchConfig.A03 = z;
            pagerSheetLaunchConfig.A00 = nmU;
            ndD.A0Q(new C72706PGk(pagerSheetLaunchConfig), j);
        }
    }

    public static final void A0G(C69028NdD ndD) {
        if (DbX.A1a(ndD.A07.A05) && !((C68280N8r) ndD.A0O()).A03.isEmpty()) {
            ndD.A0L(new C59100J6i(ndD, 42), false);
        }
    }

    public static final void A0H(C69028NdD ndD, int i) {
        String id;
        C69028NdD ndD2 = ndD;
        int i2 = i;
        N4t n4t = (N4t) 00k.A0O(((C68280N8r) ndD2.A0O()).A02, i2);
        if (n4t != null) {
            C71144Ody ody = ndD2.A03;
            String str = n4t.A0A;
            if (str == null || str.length() == 0) {
                id = n4t.A06.getId();
            } else {
                id = String.valueOf(str);
            }
            C71144Ody.A00((C54671HOc) null, (C69486NmU) null, (C69486NmU) null, (C69455Nlz) null, ody, (AnonymousClass4A5) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i2), Integer.valueOf(DbT.A02(((C68280N8r) ndD2.A0O()).A02, 1)), (Integer) null, (Long) null, "INTERACTION_CARD_VIEW", "TAP", (String) null, id, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null);
        }
    }

    public static final void A0K(C69028NdD ndD, C62320sa r11) {
        UserSession userSession = ndD.A02;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass4A5 r1 = ((AnonymousClass4A6) ndD.A05.A0N.getValue()).A04;
        if (!(r1 == AnonymousClass4A5.UNSET || r1 == AnonymousClass4A5.PRIVATE)) {
            0s0 r6 = A002.A1O;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (((long) DbY.A03(A002, r6, r5, CameraCapturer.OPEN_CAMERA_DELAY_MS)) < 1 && 182.A06(0Tu.A05, userSession, 36321769624053468L)) {
                ndD.A0P(new C72718PGy(new C58185Inp(30, r11, ndD), new C73898PlZ(ndD, 49), new C73662Phb(ndD, 0)));
                DbZ.A1b(A002, r6, r5, CameraCapturer.OPEN_CAMERA_DELAY_MS);
                return;
            }
        }
        r11.invoke();
    }

    private final void A0L(0sP r6, boolean z) {
        Location lastLocation;
        1Wr r4 = 1Wr.A00;
        if (r4 == null) {
            lastLocation = null;
        } else {
            UserSession userSession = this.A02;
            lastLocation = r4.getLastLocation(userSession, "FriendMapViewModel");
            if (z || lastLocation == null || !C270984hi.A00(lastLocation)) {
                r4.requestLocationUpdates(userSession, new C65423Lt3(r6, 2), "FRIEND_MAP", true);
                return;
            }
        }
        r6.invoke(lastLocation);
    }

    private final boolean A0M() {
        boolean A1W = AnonymousClass7TF.A1W(((AnonymousClass4A6) this.A05.A0N.getValue()).A04, AnonymousClass4A5.PRIVATE);
        boolean z = !this.A06.A02(AnonymousClass05K.A00).A01;
        if ((A1W || z || A0S() != null) && AnonymousClass3HF.A03(this.A02)) {
            return true;
        }
        return false;
    }

    public final void A0T() {
        A0F(C69031NdI.A00, this);
        A0P(PH4.A00);
        A0I(this, 400);
    }

    public final void A0U() {
        Object obj;
        A0Q(PH4.A00, 0);
        Iterator A022 = MYL.A02(this);
        while (true) {
            if (!A022.hasNext()) {
                obj = null;
                break;
            }
            obj = A022.next();
            if (0qQ.A0K(((N4t) obj).A0B, this.A07.A06)) {
                break;
            }
        }
        N4t n4t = (N4t) obj;
        if (n4t != null) {
            n4t.A00 = false;
            this.A07.A06 = null;
            A0Q(new C72701PGf(n4t), 0);
            A08(n4t.A03, this, 15.0f, 0, true, true, false);
        }
    }

    public final void A0W(C69486NmU nmU, boolean z) {
        if (182.A06(0Tu.A05, this.A02, 36321769623987931L)) {
            A0X(nmU, z, false);
        }
    }

    public final void A0X(C69486NmU nmU, boolean z, boolean z2) {
        C73372PbV pbV = new C73372PbV(nmU, this, z, z2);
        if (z) {
            pbV.run();
        } else {
            A09(nmU, this, AnonymousClass05K.A0N, new C73662Phb(pbV, 7));
        }
    }

    public final void A0Y(C68150N2q n2q) {
        LatLng A042;
        Number valueOf;
        C68150N2q n2q2 = n2q;
        if (n2q != null) {
            A042 = new LatLng(n2q2.A00, n2q2.A01);
        } else {
            A042 = A04(this);
            if (A042 == null) {
                return;
            }
        }
        UserSession userSession = this.A02;
        User A022 = 17h.A00(userSession).A02(userSession.A06);
        if (A022 != null) {
            if (n2q != null) {
                valueOf = Integer.valueOf(n2q2.A02);
            } else {
                valueOf = Float.valueOf(250.0f);
            }
            A0F(new NdF(new N4t(A042, (AnonymousClass4AB) null, A022, AnonymousClass05K.A0C, "0", (String) null, (String) null, (String) null, Integer.MAX_VALUE, 0, false, false, false, true, false, false, false, false, false, true)), this);
            A0Q(new C72712PGs(A042, valueOf.doubleValue()), 0);
            A0P(new C72719PGz(new LatLng(A042.A00, A042.A01), 15.8f, true, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r9 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0b(java.util.List r9) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r5 = r8.A02
            r6 = 0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321769623594710(0x810a75000726d6, double:3.033371593763688E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x0055
            X.O93 r0 = X.MYL.A01(r8)
            boolean r0 = r0 instanceof X.C69031NdI
            if (r0 == 0) goto L_0x0055
            X.OI3 r7 = r8.A07
            boolean r0 = r7.A08
            r3 = 1
            if (r0 == 0) goto L_0x006f
            X.JM9 r0 = r8.A0O()
            X.N8r r0 = (X.C68280N8r) r0
            java.util.Set r1 = r0.A03
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0056
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0056
        L_0x0031:
            if (r9 == 0) goto L_0x006f
        L_0x0033:
            r7.A08 = r6
            r0 = 44
            X.J6i r2 = new X.J6i
            r2.<init>(r8, r0)
            r0 = 36321769626937087(0x810a75003a26ff, double:3.0333715958774205E-306)
            X.182.A06(r4, r5, r0)
            X.PGv r0 = new X.PGv
            r0.<init>(r2, r3)
            r8.A0P(r0)
            if (r3 == 0) goto L_0x0055
            X.PH2 r2 = X.PH2.A00
            r0 = 2000(0x7d0, double:9.88E-321)
            r8.A0Q(r2, r0)
        L_0x0055:
            return
        L_0x0056:
            java.util.Iterator r2 = r1.iterator()
        L_0x005a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            X.N4t r1 = X.C66580MXl.A0f(r2)
            boolean r0 = r1.A06(r5)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r1.A0G
            if (r0 == 0) goto L_0x005a
            goto L_0x0033
        L_0x006f:
            r3 = 0
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69028NdD.A0b(java.util.List):void");
    }

    public final void A0c(boolean z, String str) {
        this.A07.A00 = -1;
        A0F(C69031NdI.A00, this);
        A0P(PH4.A00);
        if (182.A06(0Tu.A05, this.A02, 36321769626937087L) && z) {
            A0P(new C72707PGl(str));
        }
        A0b((List) null);
    }

    public final void onCleared() {
        OI3 oi3 = this.A07;
        oi3.A09 = false;
        oi3.A05 = null;
        oi3.A08 = false;
        oi3.A02 = null;
        oi3.A04 = null;
        oi3.A00 = -1;
    }

    public final void onPause(AnonymousClass07Z r3) {
        this.A07.A09 = true;
        C51970G9q.A1S(this.A05.A03);
    }

    public static final LatLng A04(C69028NdD ndD) {
        Location A032 = A03(ndD);
        if (A032 != null) {
            return new LatLng(A032.getLatitude(), A032.getLongitude());
        }
        return null;
    }

    public static final AnonymousClass4A5 A06(C69028NdD ndD) {
        if (ndD.A0M() || !(MYL.A01(ndD) instanceof C69031NdI)) {
            return null;
        }
        OI3 oi3 = ndD.A07;
        if ((!DbX.A1a(oi3.A03) && oi3.A03 != null) || !AnonymousClass3HF.A03(ndD.A02)) {
            return null;
        }
        oi3.A03 = AnonymousClass7TE.A0u();
        return ((AnonymousClass4A6) ndD.A05.A0N.getValue()).A04;
    }

    public static final void A0J(C69028NdD ndD, String str) {
        String str2;
        Set set = ((C68280N8r) ndD.A0O()).A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = set.iterator();
        while (true) {
            str2 = str;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (str.equals(N4t.A01(next))) {
                A1C.add(next);
            }
        }
        Set A0k = 00k.A0k(A1C);
        Iterator it2 = ((C68280N8r) ndD.A0O()).A02.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (0qQ.A0K(N4t.A01(it2.next()), str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        O93 A012 = MYL.A01(ndD);
        if (A012 instanceof C69030NdG) {
            String str3 = ((C69030NdG) A012).A02;
            if (str3 == null || str3.length() == 0) {
                A0H(ndD, i);
            }
            ndD.A0R(new C58770IxH(A012, A0k, str2, i, 4));
        } else {
            ndD.A0P(new PHA(false, C73832PkV.A00));
            A0F(new C69030NdG(A03(ndD), str, str, A0k, i), ndD);
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A0k);
        Iterator it3 = A0k.iterator();
        while (it3.hasNext()) {
            A0r.add(C66580MXl.A0f(it3).A04);
        }
        ndD.A0P(new PGq(A0r));
    }

    public static final boolean A0N(C69028NdD ndD, Set set) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : set) {
            if (((N4t) next).A0J) {
                A1C.add(next);
            }
        }
        if (!(!A1C.isEmpty())) {
            return false;
        }
        if (182.A06(0Tu.A05, ndD.A02, 36321769626740476L)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.N2q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.N2q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.N2q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.N2q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C68150N2q A0S() {
        /*
            r10 = this;
            com.facebook.android.maps.model.LatLng r8 = A04(r10)
            r7 = 0
            if (r8 == 0) goto L_0x003b
            com.instagram.friendmap.data.FriendMapRepository r0 = r10.A05
            X.0Ud r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            X.4A6 r0 = (X.AnonymousClass4A6) r0
            java.util.List r0 = r0.A05
            java.util.Iterator r9 = r0.iterator()
        L_0x0017:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r6 = r9.next()
            r5 = r6
            X.N2q r5 = (X.C68150N2q) r5
            double r3 = r5.A00
            double r1 = r5.A01
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng
            r0.<init>(r3, r1)
            double r3 = r8.A00(r0)
            int r0 = r5.A02
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0017
            r7 = r6
        L_0x0039:
            X.N2q r7 = (X.C68150N2q) r7
        L_0x003b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69028NdD.A0S():X.N2q");
    }

    public final void A0V(Location location) {
        AnonymousClass7TE.A1Z(new C73567Pfo(location, this, (AnonymousClass4D7) null, 34), C318116oQ.A00(this));
    }
}
