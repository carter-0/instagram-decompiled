package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.MqG  reason: case insensitive filesystem */
public final class C67582MqG extends C249703kE {
    public final TextView A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final IgImageView A09;
    public final IgImageView A0A;
    public final AnonymousClass4AD A0B;
    public final NoteBubbleView A0C;

    public static final void A00(NoteCustomTheme noteCustomTheme, C67582MqG mqG) {
        int color;
        NoteActivationType noteActivationType;
        String Aej;
        mqG.A0C.setCustomTheme(noteCustomTheme);
        boolean z = true;
        int i = 0;
        if (noteCustomTheme == null || (Aej = noteCustomTheme.Aej()) == null || Aej.length() == 0) {
            Context A072 = DbS.A07(mqG);
            color = A072.getColor(2Yu.A02(A072));
        } else {
            color = Color.parseColor(noteCustomTheme.Aej());
        }
        AnonymousClass7TE.A1R(mqG.A07.getBackground(), color);
        if (noteCustomTheme != null) {
            noteActivationType = noteCustomTheme.AYd();
        } else {
            noteActivationType = null;
        }
        if (noteActivationType != NoteActivationType.WNBA_NOTES) {
            z = false;
        }
        IgSimpleImageView igSimpleImageView = mqG.A04;
        if (!z) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    public static final void A01(AnonymousClass4AT r5, C67582MqG mqG) {
        TextView textView;
        String string;
        String valueOf;
        int i = r5.A02;
        if (i > 0) {
            long A012 = 182.A01(0Tu.A05, mqG.A03, 36609738590721963L);
            if (((long) i) > A012) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(A012);
                valueOf = C51967G9n.A0r(A1A, '+');
            } else {
                valueOf = String.valueOf(i);
            }
            textView = mqG.A00;
            string = DbV.A0v(DbU.A05(textView), valueOf, R.plurals.media_note_stack_label, i);
        } else {
            textView = mqG.A00;
            string = DbU.A05(textView).getString(2131965922);
        }
        textView.setText(string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0055, code lost:
        if (X.182.A06(r2, r3, 36328263614217379L) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0075, code lost:
        if (r6.A0G != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass4AT r6, X.C67582MqG r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            com.instagram.common.session.UserSession r3 = r7.A03
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES
            X.4h3 r4 = new X.4h3
            r4.<init>(r0, r3)
            r0 = 1
            r4.A1Q = r0
            java.lang.String r0 = "clips_media_notes_stack"
            r4.A0p = r0
            r4.A1r = r11
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342171272827649185(0x2081105d00043ca1, double:4.072592723888719E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A1n = r0
            r0 = 2342171272828042405(0x2081105d000a3ca5, double:4.072592724222136E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A1x = r0
            r0 = 2342171272827976868(0x2081105d00093ca4, double:4.072592724166566E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A1u = r0
            r0 = 2342171272828107942(0x2081105d000b3ca6, double:4.072592724277706E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A1v = r0
            r0 = 36328263614151842(0x81105d00073ca2, double:3.037478419541219E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0057
            r0 = 36328263614217379(0x81105d00083ca3, double:3.037478419582665E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            r4.A1q = r0
            r0 = 2342171272827976868(0x2081105d00093ca4, double:4.072592724166566E-152)
            boolean r0 = X.C51965G9l.A1a(r2, r3, r0)
            r4.A1c = r0
            r4.A0l = r8
            r0 = 2342171272828304553(0x2081105d000e3ca9, double:4.072592724444415E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0077
            boolean r1 = r6.A0G
            r0 = r9
            if (r1 == 0) goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            r4.A1C = r0
            r0 = 36609738591377325(0x82105d000f17ad, double:3.215484328547374E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r2, r3, r0)
            r4.A0a = r0
            r4.A0m = r9
            com.instagram.clips.intf.ClipsViewerConfig r1 = r4.A00()
            androidx.fragment.app.FragmentActivity r0 = r7.A01
            X.C250563lf.A0Y(r0, r1, r3)
            X.1Av r4 = X.1Au.A00(r3)
            long r0 = java.lang.System.currentTimeMillis()
            X.0xY r5 = X.AnonymousClass7TE.A0p(r4)
            java.lang.String r4 = "last_media_note_stack_open_time"
            r5.E5c(r4, r0)
            r5.apply()
            if (r10 == 0) goto L_0x00bf
            boolean r0 = r6.A0F
            if (r0 == 0) goto L_0x00bf
            r0 = 2342171272827518111(0x2081105d00023c9f, double:4.072592723777579E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00bf
            A01(r6, r7)
            android.widget.TextView r2 = r7.A00
            r1 = 0
            r0 = 0
            r2.setTypeface(r1, r0)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67582MqG.A02(X.4AT, X.MqG, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67582MqG(View view, FragmentActivity fragmentActivity, AnonymousClass0iw r10, UserSession userSession, AnonymousClass4AD r12) {
        super(view);
        C51974G9v.A1P(view, userSession, fragmentActivity, r10);
        0qQ.A0B(r12, 5);
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = r10;
        this.A0B = r12;
        this.A08 = JTO.A0Y(view, R.id.media_note_stack_cover_image_front);
        this.A06 = JTO.A0Y(view, R.id.media_note_stack_cover_image_back);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.media_note_stack_item_label);
        this.A0A = JTR.A0i(view, R.id.media_note_stack_pogs);
        this.A09 = JTR.A0i(view, R.id.media_note_author_pog);
        NoteBubbleView noteBubbleView = (NoteBubbleView) AnonymousClass7TE.A0b(view, R.id.pog_note_bubble_view);
        this.A0C = noteBubbleView;
        this.A07 = JTR.A0i(view, R.id.filled_like_view);
        this.A05 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.like_animation_image_view);
        View findViewById = view.findViewById(R.id.note_custom_activation_view);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) findViewById;
        igSimpleImageView.setBackground(new C67288MlN());
        0qQ.A07(findViewById);
        this.A04 = igSimpleImageView;
        boolean A072 = C249223jK.A00.A07(userSession);
        0Tu r4 = 0Tu.A05;
        noteBubbleView.A0I(A072, 182.A06(r4, userSession, 36326713131153346L), C249223jK.A05(userSession), 182.A06(r4, userSession, 36330084679827900L));
    }
}
