package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.user.model.User;

/* renamed from: X.P3f  reason: case insensitive filesystem */
public final class C72366P3f implements C74399PuF {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass4AD A03;
    public final O7W A04;

    public final void DUW(OIR oir) {
        PHL phl;
        AnonymousClass60F r0;
        OIR oir2 = oir;
        0qQ.A0B(oir2, 0);
        C71110Ocp ocp = C71110Ocp.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        boolean z = oir2.A0C;
        AnonymousClass0iw r14 = this.A01;
        AnonymousClass4AD r13 = this.A03;
        C68209N5y n5y = oir2.A05;
        if (n5y != null) {
            long j = n5y.A00;
            User user = n5y.A02;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            boolean z2 = n5y.A07;
            ContentNoteMetadata contentNoteMetadata = oir2.A04;
            C279864zZ r4 = oir2.A03;
            if (r4 != null) {
                C300845y2 r02 = r4.A0A;
                if (r02 == null || (r0 = r02.A0B) == null) {
                    phl = null;
                } else {
                    C72367P3g p3g = new C72367P3g(fragmentActivity, r14, userSession, 24, false);
                    String str = r0.A02;
                    String str2 = r0.A03;
                    int A0A = AnonymousClass7TG.A0A(r0.A01);
                    AnonymousClass7TF.A1B(str, 1, str2);
                    phl = new PHL(new OIR((View) null, (View) null, (NotePogVideoDict) null, r4, (ContentNoteMetadata) null, (C68209N5y) null, Integer.valueOf(A0A), str, str2, (String) null, (String) null, 0sn.A00, false, false, false, false, false, false, true, false), oir2, this, p3g);
                }
                ocp.A07(fragmentActivity, r14, userSession, Bh3, contentNoteMetadata, r13, phl, id, username, j, z, z2, oir2.A0E);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01f4, code lost:
        if (r10 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01f9, code lost:
        if (r10 != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DUZ(X.OIR r53) {
        /*
            r52 = this;
            r5 = 0
            r3 = r53
            X.0qQ.A0B(r3, r5)
            boolean r0 = r3.A0G
            r16 = r0
            r7 = 1
            r1 = r52
            if (r0 == 0) goto L_0x0027
            com.instagram.common.session.UserSession r0 = r1.A02
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A2K
            X.0xa r0 = X.C51969G9p.A0n(r2, r0, r1)
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_user_acknowledged_prompt_response_education"
            r2.E5T(r0, r7)
            r2.apply()
        L_0x0027:
            X.N5y r2 = r3.A05
            r14 = 0
            if (r2 != 0) goto L_0x0038
            X.4zZ r4 = r3.A03
            if (r4 == 0) goto L_0x01e9
            X.Oe5 r2 = X.C71147Oe5.A00
            androidx.fragment.app.FragmentActivity r0 = r1.A00
            X.N5y r2 = r2.A08(r0, r4)
        L_0x0038:
            if (r2 == 0) goto L_0x01e9
            com.instagram.common.session.UserSession r0 = r1.A02
            r51 = r0
            androidx.fragment.app.FragmentActivity r6 = r1.A00
            boolean r9 = r3.A0C
            X.0iw r0 = r1.A01
            r50 = r0
            X.4AD r0 = r1.A03
            r24 = r0
            X.4zZ r10 = r3.A03
            if (r10 == 0) goto L_0x01f8
            X.5y2 r0 = r10.A0A
            if (r0 == 0) goto L_0x01f8
            com.instagram.api.schemas.MusicNoteResponseInfo r4 = r0.A07
        L_0x0054:
            X.5y2 r0 = r10.A0A
            if (r0 == 0) goto L_0x01fd
            com.instagram.api.schemas.LocationNoteResponseInfo r0 = r0.A06
            r49 = r0
        L_0x005c:
            java.lang.String r15 = r3.A09
            java.lang.String r0 = r3.A0A
            r30 = r0
            com.instagram.api.schemas.NotePogVideoDict r0 = r3.A02
            r48 = r0
            if (r10 == 0) goto L_0x01f2
            X.5y2 r0 = r10.A0A
            if (r0 == 0) goto L_0x01f2
            X.60C r0 = r0.A09
            if (r0 == 0) goto L_0x01f2
            com.instagram.api.schemas.NotePogImageDict r0 = r0.A00
            r47 = r0
        L_0x0074:
            X.5y2 r0 = r10.A0A
            if (r0 == 0) goto L_0x007a
            com.instagram.api.schemas.GIFNoteResponseInfo r14 = r0.A02
        L_0x007a:
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r8 = r3.A04
            boolean r0 = r3.A0F
            r46 = r0
            if (r10 == 0) goto L_0x0084
            boolean r7 = r10.A0O
        L_0x0084:
            X.O7W r11 = r1.A04
            boolean r10 = r3.A0D
            X.NJf r1 = new X.NJf
            r1.<init>()
            X.P3p r0 = new X.P3p
            r17 = r0
            r18 = r6
            r19 = r50
            r20 = r51
            r21 = r8
            r22 = r2
            r23 = r11
            r25 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r1.A0P = r0
            com.instagram.user.model.User r0 = r2.A02
            java.lang.String r25 = r0.getUsername()
            java.lang.String r26 = r0.B8Q()
            com.instagram.common.typedurl.ImageUrl r21 = r0.Bh3()
            java.lang.String r9 = r2.A03
            r23 = r9
            long r12 = r2.A00
            java.lang.String r28 = r0.getId()
            int r32 = r24.BWZ()
            com.instagram.direct.inbox.notes.models.NoteAudienceItem r0 = r2.A01
            com.instagram.direct.inbox.notes.models.NoteAudience r11 = r0.A00
            java.lang.String r0 = r2.A04
            r22 = r0
            com.instagram.direct.inbox.notes.models.NoteAudience r0 = com.instagram.direct.inbox.notes.models.NoteAudience.CLOSE_FRIENDS
            boolean r36 = X.AnonymousClass7TF.A1W(r11, r0)
            boolean r0 = r2.A06
            r20 = r0
            boolean r0 = r2.A07
            r19 = r0
            r9 = 0
            if (r4 == 0) goto L_0x01ee
            com.instagram.api.schemas.MusicInfo r0 = r4.A00
            r17 = r0
            com.instagram.music.common.model.MusicConsumptionModel r0 = r17.BUp()
            java.lang.Integer r0 = r0.AdU()
            int r43 = X.DbX.A01(r0)
            com.instagram.music.common.model.MusicConsumptionModel r0 = r17.BUp()
            java.lang.Integer r0 = r0.BZg()
            if (r0 == 0) goto L_0x01ea
            int r44 = r0.intValue()
        L_0x00f7:
            com.instagram.music.common.model.MusicConsumptionModel r0 = r17.BUp()
            java.lang.String r42 = r0.getDerivedContentId()
            com.instagram.music.common.model.MusicConsumptionModel r0 = r17.BUp()
            boolean r45 = r0.getShouldMuteAudio()
            com.instagram.api.schemas.TrackData r38 = r17.BUk()
            com.instagram.user.model.User r0 = r4.A01
            r18 = r0
            java.lang.Boolean r0 = r4.A02
            r17 = r0
            java.lang.Boolean r0 = r4.A03
            com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent r24 = new com.instagram.direct.inbox.notes.reply.MusicNoteQuickReplySheetContent
            r37 = r24
            r39 = r18
            r40 = r17
            r41 = r0
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)
        L_0x0122:
            boolean r2 = r2.A05
            com.instagram.direct.inbox.notes.reply.QuickReplySheetContent r0 = new com.instagram.direct.inbox.notes.reply.QuickReplySheetContent
            r27 = r23
            r29 = r22
            r31 = r15
            r33 = r12
            r35 = r5
            r37 = r5
            r38 = r20
            r39 = r19
            r40 = r16
            r41 = r46
            r42 = r10
            r43 = r2
            r17 = r14
            r18 = r49
            r19 = r47
            r20 = r48
            r22 = r8
            r23 = r11
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            android.os.Bundle r11 = X.DbY.A09(r51)
            java.lang.String r2 = "can_reply"
            r11.putBoolean(r2, r7)
            java.lang.String r2 = "pending_admin_approval"
            r11.putBoolean(r2, r5)
            java.lang.String r2 = "arg_note_id"
            r11.putLong(r2, r12)
            java.lang.String r2 = "arg_prompt_note_id"
            r11.putString(r2, r15)
            java.lang.String r2 = "arg_is_friend_map_note"
            r11.putBoolean(r2, r10)
            java.lang.String r4 = r50.getModuleName()
            java.lang.String r2 = "arg_note_consumption_module"
            r11.putString(r2, r4)
            if (r8 == 0) goto L_0x0179
            java.lang.String r9 = r8.A08
        L_0x0179:
            java.lang.String r2 = "arg_associated_media_id"
            r11.putString(r2, r9)
            if (r8 != 0) goto L_0x0182
            if (r10 == 0) goto L_0x0184
        L_0x0182:
            r1.A0R = r0
        L_0x0184:
            r1.setArguments(r11)
            boolean r0 = r3.A0I
            X.7Pr r7 = X.DbS.A0W(r51)
            r7.A1O = r0
            r0 = r0 ^ 1
            r7.A1F = r0
            r4 = 1
            X.Lz8 r0 = new X.Lz8
            r0.<init>(r1, r4)
            r7.A0X = r0
            r7.A0U = r1
            r7.A1K = r5
            X.0Tu r8 = X.0Tu.A05
            r2 = 36328499836894587(0x81109400003d7b, double:3.037627807754924E-306)
            r0 = r51
            boolean r0 = X.182.A06(r8, r0, r2)
            if (r0 == 0) goto L_0x01e6
            r1.A0a = r4
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r5)
            r7.A0I = r0
            r0 = 2130970208(0x7f040660, float:1.754912E38)
            int r2 = X.AnonymousClass7TF.A03(r6, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r7.A0J = r0
            boolean r2 = X.C61670oa.A04()
            r0 = 2130968778(0x7f0400ca, float:1.754622E38)
            if (r2 == 0) goto L_0x01d1
            r0 = 2130968779(0x7f0400cb, float:1.7546221E38)
        L_0x01d1:
            int r0 = X.2Yu.A0H(r6, r0)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r7.A0H = r0
            r7.A1R = r4
            r7.A0p = r5
            X.PQc r0 = new X.PQc
            r0.<init>(r1, r4)
            r7.A0T = r0
        L_0x01e6:
            X.C71110Ocp.A02(r6, r1, r7)
        L_0x01e9:
            return
        L_0x01ea:
            r44 = 30000(0x7530, float:4.2039E-41)
            goto L_0x00f7
        L_0x01ee:
            r24 = r9
            goto L_0x0122
        L_0x01f2:
            r47 = r14
            if (r10 == 0) goto L_0x007a
            goto L_0x0074
        L_0x01f8:
            r4 = r14
            if (r10 == 0) goto L_0x01fd
            goto L_0x0054
        L_0x01fd:
            r49 = r14
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72366P3f.DUZ(X.OIR):void");
    }

    public C72366P3f(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, O7W o7w, AnonymousClass4AD r5) {
        C51972G9s.A1B(userSession, r5);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A03 = r5;
        this.A04 = o7w;
    }
}
