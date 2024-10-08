package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.ui.immersiveselfnote.ContentNotesImmersiveSelfNoteContent;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.33A  reason: invalid class name */
public final class AnonymousClass33A implements AnonymousClass33B {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C377239Lb(this, 34));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C377239Lb(this, 35));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C377239Lb(this, 36));

    public AnonymousClass33A(FragmentActivity fragmentActivity, AnonymousClass0iw r4, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r4;
    }

    public final void D5w(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C62320sa r11) {
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        User user = notesPogThoughtBubbleUiState.A06;
        String shortName = user.getShortName();
        if (shortName == null) {
            shortName = user.B8Q();
        }
        C45217CsV csV = new C45217CsV(r11);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(fragmentActivity);
        Bundle bundle = new Bundle();
        bundle.putString(AnonymousClass000.A00(2930), shortName);
        C47403E0v e0v = new C47403E0v();
        e0v.setArguments(bundle);
        e0v.A00 = csV;
        C331157Pu A002 = C48943Emh.A00(A012);
        if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
            C331127Pr r1 = new C331127Pr(userSession);
            r1.A0V = new C57387IZs(A012);
            r1.A0U = new C45971DHa(csV);
            r1.A00().A02(fragmentActivity, e0v);
            return;
        }
        A002.A0G(e0v, new C331127Pr(userSession), false, false);
        if (A012 != null) {
            AnonymousClass37F r12 = (AnonymousClass37F) A012;
            r12.A0H = new C45972DHb(csV);
            r12.A0F = new C57386IZr(A012);
        }
    }

    public final void DPF(AnonymousClass0iw r23, AnonymousClass4GS r24, C54692HOx hOx, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z) {
        String str;
        long j;
        String str2;
        AnonymousClass0iw r10 = r23;
        0qQ.A0B(r10, 0);
        C54692HOx hOx2 = hOx;
        0qQ.A0B(hOx2, 1);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        0qQ.A0B(notesPogThoughtBubbleUiState2, 2);
        int ordinal = hOx2.ordinal();
        Integer num = null;
        AnonymousClass4GS r0 = r24;
        if (ordinal == 0) {
            if (r24 != null) {
                str = r0.All();
                num = r0.Als();
            } else {
                str = null;
            }
            A01(GPK.NOTE_LONG_PRESS, notesPogThoughtBubbleUiState2, this, num, str);
        } else if (ordinal == 1) {
            UserSession userSession = this.A02;
            C71110Ocp.A01(this.A00, GPK.NOTE_LONG_PRESS, userSession, GMU.A02(r0, notesPogThoughtBubbleUiState2), notesPogThoughtBubbleUiState2.A0C, notesPogThoughtBubbleUiState2.A0J, false);
        } else if (ordinal == 2) {
            UserSession userSession2 = this.A02;
            FragmentActivity fragmentActivity = this.A00;
            String str3 = notesPogThoughtBubbleUiState2.A0I;
            String str4 = notesPogThoughtBubbleUiState2.A0H;
            User user = notesPogThoughtBubbleUiState2.A06;
            ContentNoteMetadata A022 = GMU.A02(r0, notesPogThoughtBubbleUiState2);
            C55471HiF hiF = (C55471HiF) this.A05.getValue();
            String string = fragmentActivity.getString(2131957578);
            if (string == null) {
                string = "";
            }
            0qQ.A0B(user, 0);
            C71147Oe5.A04(fragmentActivity, r10, userSession2, new IR2(A022, hiF, user, string), str3, str4, notesPogThoughtBubbleUiState2.A0J);
        } else if (ordinal == 3) {
            1Eo.A05(19B.A00, new JTY(notesPogThoughtBubbleUiState2, r0, this, r10, (AnonymousClass4D7) null, 1, z), AnonymousClass07a.A00(this.A00));
        } else if (ordinal == 4) {
            UserSession userSession3 = this.A02;
            String str5 = notesPogThoughtBubbleUiState2.A0H;
            0qQ.A0B(str5, 0);
            Long A0n = 00y.A0n(10, str5);
            if (A0n != null) {
                j = A0n.longValue();
            } else {
                j = -1;
            }
            String str6 = notesPogThoughtBubbleUiState2.A0F;
            String str7 = notesPogThoughtBubbleUiState2.A0C;
            String str8 = notesPogThoughtBubbleUiState2.A0I;
            String str9 = notesPogThoughtBubbleUiState2.A0D;
            if (r24 != null) {
                str2 = r0.All();
                num = r0.Als();
            } else {
                str2 = null;
            }
            C57127IPq iPq = new C57127IPq(str2, num);
            String string2 = this.A00.getString(2131957578);
            if (string2 == null) {
                string2 = "";
            }
            0qQ.A0B(str6, 2);
            0qQ.A0B(str7, 3);
            String str10 = str7;
            AnonymousClass4JJ.A00(userSession3).A04(iPq.Als(), str6, String.valueOf(j), str10, str9, str8, iPq.All(), string2);
        } else {
            throw new RuntimeException();
        }
    }

    public final void DUq(C247003fc r8, 1Xj r9, Integer num, WeakReference weakReference, C62320sa r12, 0sP r13) {
        0qQ.A0B(weakReference, 0);
        0qQ.A0B(r9, 2);
        C247003fc r1 = r8;
        0qQ.A0B(r8, 3);
        0qQ.A0B(r12, 4);
        0qQ.A0B(r13, 5);
        AnonymousClass33C r0 = (AnonymousClass33C) this.A03.getValue();
        r0.DUq(r1, r9, num, weakReference, r12, r13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (X.182.A06(r3, r4, 36323161193196469L) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DVf(android.view.View r32, com.instagram.api.schemas.NoteCustomTheme r33, com.instagram.contentnotes.data.metadata.ContentNoteMetadata r34, X.AnonymousClass4DU r35, java.lang.Integer r36, java.lang.Integer r37, java.lang.Long r38, java.lang.String r39, boolean r40, boolean r41) {
        /*
            r31 = this;
            r5 = 1
            r8 = r35
            X.0qQ.A0B(r8, r5)
            r0 = 3
            r6 = r36
            X.0qQ.A0B(r6, r0)
            r0 = 5
            r11 = r39
            X.0qQ.A0B(r11, r0)
            r15 = r34
            com.instagram.user.model.User r7 = r15.A01
            r2 = r31
            com.instagram.common.session.UserSession r4 = r2.A02
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320652937011959(0x810971005222f7, double:3.03266539667222E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 != 0) goto L_0x0033
            r0 = 36323161193196469(0x810bb9000a2bb5, double:3.034251627983241E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            r9 = 0
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r9 = 1
        L_0x0034:
            r3 = 0
            r0 = 0
            r17 = r38
            r25 = r41
            if (r9 == 0) goto L_0x00a8
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r14 = 0
            if (r6 == r9) goto L_0x0055
            r10 = r32
            if (r32 == 0) goto L_0x0055
            r6 = 2
            int[] r9 = new int[r6]
            r10.getLocationInWindow(r9)
            r6 = r9[r3]
            r5 = r9[r5]
            com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates r14 = new com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates
            r14.<init>(r6, r5)
        L_0x0055:
            java.lang.String r6 = r15.A09
            if (r6 == 0) goto L_0x00a7
            java.lang.String r18 = r7.getUsername()
            java.lang.String r19 = r7.B8Q()
            java.lang.String r22 = r7.getId()
            com.instagram.direct.inbox.notes.models.NoteAudience r16 = X.AnonymousClass916.A00(r37)
            if (r38 == 0) goto L_0x006f
            long r0 = r17.longValue()
        L_0x006f:
            androidx.fragment.app.FragmentActivity r5 = r2.A00
            java.lang.String r23 = X.C71147Oe5.A02(r5, r0)
            boolean r26 = r8.isOrganicEligible()
            boolean r27 = r8.isSponsoredEligible()
            boolean r29 = X.C71106Ock.A02(r5)
            X.0sn r24 = X.0sn.A00
            com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent r12 = new com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent
            r13 = r33
            r28 = r40
            r30 = r3
            r20 = r11
            r21 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r1 = "note_content"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r12)
            X.0eP[] r0 = new X.0eP[]{r0}
            android.os.Bundle r0 = X.Q21.A00(r0)
            r2.A00(r0)
        L_0x00a4:
            X.C247323g9.A00(r4)
        L_0x00a7:
            return
        L_0x00a8:
            java.lang.Integer r6 = r7.Bjj()
            if (r6 == 0) goto L_0x00b1
            r6.intValue()
        L_0x00b1:
            java.lang.String r9 = r15.A09
            if (r9 == 0) goto L_0x011f
            r6 = 10
            java.lang.Long r6 = X.00y.A0n(r6, r9)
            if (r6 == 0) goto L_0x011f
            long r21 = r6.longValue()
        L_0x00c1:
            com.instagram.direct.inbox.notes.models.NoteAudience r10 = X.AnonymousClass916.A00(r37)
            r9 = 0
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r6 = new com.instagram.direct.inbox.notes.models.NoteAudienceItem
            r6.<init>(r10, r9, r9, r3)
            if (r38 == 0) goto L_0x00d1
            long r0 = r17.longValue()
        L_0x00d1:
            androidx.fragment.app.FragmentActivity r10 = r2.A00
            java.lang.String r20 = X.C71147Oe5.A02(r10, r0)
            X.N5y r16 = new X.N5y
            r17 = r6
            r18 = r7
            r19 = r11
            r23 = r25
            r24 = r3
            r25 = r3
            r26 = r5
            r16.<init>(r17, r18, r19, r20, r21, r23, r24, r25, r26)
            r12 = r9
            r13 = r9
            r14 = r9
            r17 = r3
            r18 = r3
            r19 = r3
            r20 = r3
            X.OIR r3 = X.C71047OaP.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.0eM r0 = r2.A05
            java.lang.Object r2 = r0.getValue()
            X.HiF r2 = (X.C55471HiF) r2
            r0 = 2131957578(0x7f13174a, float:1.9551744E38)
            java.lang.String r0 = r10.getString(r0)
            if (r0 != 0) goto L_0x010c
            java.lang.String r0 = ""
        L_0x010c:
            X.IR2 r1 = new X.IR2
            r1.<init>(r15, r2, r7, r0)
            X.P3f r0 = new X.P3f
            r5 = r0
            r6 = r10
            r7 = r8
            r8 = r4
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r0.DUZ(r3)
            goto L_0x00a4
        L_0x011f:
            r21 = 0
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33A.DVf(android.view.View, com.instagram.api.schemas.NoteCustomTheme, com.instagram.contentnotes.data.metadata.ContentNoteMetadata, X.4DU, java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, boolean, boolean):void");
    }

    public final void Diu(View view, Fragment fragment, ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass4DU r14, Integer num) {
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass37D A012 = r0.A01(fragmentActivity);
        if (A012 != null) {
            C331157Pu A002 = C48943Emh.A00(A012);
            if (!(contentNoteMetadata == null || r14 == null || notesPogThoughtBubbleUiState == null)) {
                UserSession userSession = this.A02;
                if (182.A06(0Tu.A05, userSession, 36323161193982909L)) {
                    Bundle A003 = Q21.A00(new 0eP("note_content", new ContentNotesImmersiveSelfNoteContent(contentNoteMetadata, notesPogThoughtBubbleUiState, r14.isOrganicEligible(), r14.isSponsoredEligible())));
                    C54162H1g h1g = new C54162H1g();
                    h1g.setArguments(A003);
                    C331127Pr r6 = new C331127Pr(userSession);
                    r6.A0T = h1g;
                    r6.A0I = new ColorDrawable(0);
                    r6.A0J = new ColorDrawable(fragmentActivity.getColor(2Yu.A0H(fragmentActivity, R.attr.igds_color_elevated_background)));
                    r6.A0H = fragmentActivity.getDrawable(R.drawable.igds_bottom_sheet_background);
                    r6.A1R = true;
                    r6.A1C = false;
                    if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
                        r6.A00().A02(fragmentActivity, h1g);
                        return;
                    } else {
                        A02(this, new C58195Inz(36, r6, this, h1g));
                        return;
                    }
                }
            }
            if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
                new C331127Pr(this.A02).A00().A02(fragmentActivity, fragment);
            } else {
                A002.A0G(fragment, new C331127Pr(this.A02), true, false);
            }
        }
    }

    public final void Div(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        Integer num2 = notesPogThoughtBubbleUiState2.A08;
        Integer num3 = num;
        String str2 = str;
        if (num2 != AnonymousClass05K.A0N || !((C247383gF) this.A04.getValue()).A07(notesPogThoughtBubbleUiState2.A0Q)) {
            A01(GMU.A00(notesPogThoughtBubbleUiState2), notesPogThoughtBubbleUiState2, this, num3, str2);
            return;
        }
        F1J f1j = E68.A08;
        FragmentActivity fragmentActivity = this.A00;
        f1j.A00(fragmentActivity, GPK.RECS_NUX, this.A02, new IQ0(fragmentActivity, new C58210IoE(num3, this, notesPogThoughtBubbleUiState2, str2, 13)), notesPogThoughtBubbleUiState2.A0F, notesPogThoughtBubbleUiState2.A0C, C59701JUi.A00(num2), false, true);
    }

    public final void EbG(0sP r1) {
    }

    public final void Euu(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        0qQ.A0B(notesPogThoughtBubbleUiState2, 0);
        Integer num2 = notesPogThoughtBubbleUiState2.A08;
        if (num2 == AnonymousClass05K.A0N) {
            if (((C247383gF) this.A04.getValue()).A07(notesPogThoughtBubbleUiState2.A0Q)) {
                F1J f1j = E68.A08;
                FragmentActivity fragmentActivity = this.A00;
                f1j.A00(fragmentActivity, GPK.RECS_NUX_DWELL, this.A02, new IQ0(fragmentActivity, new C58210IoE(num, this, notesPogThoughtBubbleUiState2, str, 14)), notesPogThoughtBubbleUiState2.A0F, notesPogThoughtBubbleUiState2.A0C, C59701JUi.A00(num2), false, true);
            }
        }
    }

    private final void A00(Bundle bundle) {
        int[] iArr;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity, bundle, userSession, TransparentModalActivity.class, "content_notes_immersive_reply");
        if (!C71106Ock.A01() || !182.A06(0Tu.A05, userSession, 36323161193393080L)) {
            iArr = AnonymousClass6W8.A0Q;
        } else {
            iArr = ModalActivity.A08;
        }
        r3.A0J = iArr;
        r3.A0C(fragmentActivity);
        C247323g9.A00(userSession);
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(fragmentActivity);
        if (A012 != null) {
            A012.A0B();
        }
    }

    public static final void A01(GPK gpk, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass33A r17, Integer num, String str) {
        C71071Oaq oaq = C71071Oaq.A00;
        AnonymousClass33A r0 = r17;
        UserSession userSession = r0.A02;
        WeakReference weakReference = new WeakReference(r0.A00);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState2 = notesPogThoughtBubbleUiState;
        String str2 = notesPogThoughtBubbleUiState2.A0F;
        String str3 = notesPogThoughtBubbleUiState2.A0E;
        String str4 = notesPogThoughtBubbleUiState2.A0C;
        String str5 = notesPogThoughtBubbleUiState2.A0D;
        String str6 = notesPogThoughtBubbleUiState2.A0I;
        GPK gpk2 = gpk;
        oaq.A02(userSession, new N2M(gpk2, notesPogThoughtBubbleUiState2.A04, (ContentNotesImmersiveMimicryParams) null, Integer.valueOf(notesPogThoughtBubbleUiState2.A01), num, str2, str3, str4, str5, str6, str, (String) null, false), weakReference);
    }

    public static final void A02(AnonymousClass33A r2, C62320sa r3) {
        AnonymousClass37D A012 = AnonymousClass37D.A00.A01(r2.A00);
        if (A012 != null) {
            ((AnonymousClass37F) A012).A0H = new C72960PQs(r3);
            A012.A0B();
        }
    }

    public final void DIP(NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, AnonymousClass4DU r25, Integer num, Long l, String str, List list, boolean z, boolean z2) {
        long j;
        ContentNoteMetadata contentNoteMetadata2 = contentNoteMetadata;
        User user = contentNoteMetadata2.A01;
        String str2 = contentNoteMetadata2.A09;
        if (str2 != null) {
            String username = user.getUsername();
            String B8Q = user.B8Q();
            String id = user.getId();
            NoteAudience A002 = AnonymousClass916.A00(num);
            Long l2 = l;
            if (l != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            FragmentActivity fragmentActivity = this.A00;
            A00(Q21.A00(new 0eP("note_content", new ContentNotesImmersiveReplyContent(noteCustomTheme, (ContentNotesCoordinates) null, contentNoteMetadata2, A002, l2, username, B8Q, str, str2, id, C71147Oe5.A02(fragmentActivity, j), list, z2, r25.isOrganicEligible(), r25.isSponsoredEligible(), true, C71106Ock.A02(fragmentActivity), true))));
        }
    }

    public final void DVn(Fragment fragment, C273494mf r6) {
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = this.A00;
        C331157Pu A002 = C48943Emh.A00(r0.A01(fragmentActivity));
        if (A002 == null || A002.A03.getViewLifecycleOwner().getLifecycle().A07().compareTo(07U.A01) < 0) {
            C331127Pr r1 = new C331127Pr(this.A02);
            r1.A0T = r6;
            r1.A0d = fragmentActivity.getString(2131956655);
            r1.A00().A02(fragmentActivity, fragment);
            return;
        }
        C331127Pr r2 = new C331127Pr(this.A02);
        r2.A0T = r6;
        A002.A0G(fragment, r2, true, false);
    }
}
