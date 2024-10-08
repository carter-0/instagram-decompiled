package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView;
import com.instagram.common.ui.base.IgButton;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.H0o  reason: case insensitive filesystem */
public final class C54144H0o extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsAuditionFragment";
    public Dialog A00;
    public ViewGroup A01;
    public C54607HKq A02;
    public SoundSyncPreviewView A03;
    public C39739A7f A04;
    public IgButton A05;
    public IgButton A06;
    public IgdsMediaButton A07;
    public IgdsMediaButton A08;
    public C227182im A09;
    public boolean A0A;
    public boolean A0B;
    public String A0C;
    public final AnonymousClass0eM A0D = C58679Ivo.A00(this, 22);
    public final AnonymousClass0eM A0E = C58679Ivo.A00(this, 23);
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public static void A00(View.OnClickListener onClickListener, View view) {
        AnonymousClass3NG r1 = new AnonymousClass3NG(view);
        r1.A04 = new C54310H7f(view, 0);
        r1.A07 = true;
        r1.A02 = 0.9f;
        r1.A00();
        AnonymousClass0fU.A00(onClickListener, view);
    }

    public final String getModuleName() {
        return "clips_audition";
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.Object, X.5n1] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010b, code lost:
        if (r0 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020a, code lost:
        if (r0 == null) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r13.A0F), 36316959260283615L) == false) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r3 = 0
            X.0qQ.A0B(r14, r3)
            super.onViewCreated(r14, r15)
            boolean r0 = r14 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L_0x0317
            android.os.Bundle r2 = r13.requireArguments()
            java.lang.Class<com.instagram.common.gallery.Medium> r1 = com.instagram.common.gallery.Medium.class
            java.lang.String r0 = "selected_media"
            java.util.ArrayList r4 = X.C320236s2.A02(r2, r1, r0)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0210
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0210
        L_0x0021:
            android.os.Bundle r2 = r13.requireArguments()
            java.lang.Class<com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec> r1 = com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec.class
            java.lang.String r0 = "camera_spec"
            android.os.Parcelable r5 = X.C320236s2.A00(r2, r1, r0)
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r5 = (com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec) r5
            android.os.Bundle r1 = r13.requireArguments()
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.C320236s2.A01(r1, r0)
            r13.A0C = r0
            androidx.fragment.app.FragmentActivity r2 = r13.requireActivity()
            r0 = 2131430238(0x7f0b0b5e, float:1.8482171E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r14, r0)
            r13.A01 = r0
            r8 = 5
            X.M01 r1 = new X.M01
            r1.<init>(r14, r8)
            r13.A09 = r1
            X.2ff r0 = X.C226112fe.A0B
            r0.A04(r2, r1, r3)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "is_from_gallery_selection_entry_point"
            boolean r0 = r1.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x007a
            X.0eM r0 = r13.A0F
            X.0lg r7 = X.DbT.A0X(r0)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36316959260283615(0x810615000812df, double:3.030329500635973E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            r6 = 1
            if (r0 != 0) goto L_0x007b
        L_0x007a:
            r6 = 0
        L_0x007b:
            r0 = 2131438180(0x7f0b2a64, float:1.849828E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.common.ui.base.IgButton r0 = (com.instagram.common.ui.base.IgButton) r0
            r13.A05 = r0
            boolean r0 = A04(r13)
            r7 = 8
            java.lang.String r12 = "primaryFooterTextButton"
            if (r0 == 0) goto L_0x01f8
            r0 = 2131438179(0x7f0b2a63, float:1.8498278E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            r13.A08 = r0
            com.instagram.common.ui.base.IgButton r0 = r13.A05
            if (r0 == 0) goto L_0x020c
            r0.setVisibility(r7)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x00a9
            r0.setVisibility(r3)
        L_0x00a9:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r13.A08
            if (r1 == 0) goto L_0x00b2
            X.5pj r0 = X.C296235pj.PRIMARY
            r1.setButtonStyle(r0)
        L_0x00b2:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r13.A08
            if (r1 == 0) goto L_0x00bb
            X.Khx r0 = X.C62567Khx.CREATION_ARROW_FILLED
            r1.setEndAddOn(r0)
        L_0x00bb:
            r0 = 2131438178(0x7f0b2a62, float:1.8498276E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r0
            r13.A07 = r0
            r0 = 2131440859(0x7f0b34db, float:1.8503713E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.common.ui.base.IgButton r0 = (com.instagram.common.ui.base.IgButton) r0
            r13.A06 = r0
            java.lang.String r11 = "secondaryFooterTextButton"
            java.lang.String r10 = "primaryFooterImageButton"
            if (r6 == 0) goto L_0x019d
            com.instagram.igds.components.mediabutton.IgdsMediaButton r9 = r13.A07
            if (r9 == 0) goto L_0x01f4
            r0 = 2131237920(0x7f081c20, float:1.8092104E38)
            X.5n1 r6 = new X.5n1
            r6.<init>()
            r6.A00 = r0
            android.content.Context r1 = r13.requireContext()
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            java.lang.String r0 = r1.getString(r0)
            r9.setStartAddOn(r6, r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A07
            if (r0 == 0) goto L_0x01f4
            r0.setVisibility(r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A07
            if (r0 == 0) goto L_0x01f4
            X.C56801ICy.A01(r0, r8, r13)
            r13.A0A = r2
            boolean r0 = A04(r13)
            if (r0 == 0) goto L_0x0208
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x0110
        L_0x010d:
            r0.setVisibility(r7)
        L_0x0110:
            com.instagram.common.ui.base.IgButton r6 = r13.A06
            if (r6 == 0) goto L_0x018c
            android.content.Context r1 = r13.requireContext()
            r0 = 2131961425(0x7f132651, float:1.9559547E38)
            X.DbT.A18(r1, r6, r0)
            com.instagram.common.ui.base.IgButton r1 = r13.A06
            if (r1 == 0) goto L_0x018c
            r0 = 6
            X.ICy r0 = X.C56801ICy.A00(r13, r0)
            A00(r0, r1)
            r13.A0B = r2
            r0 = 2131433819(0x7f0b195b, float:1.8489434E38)
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r14, r0)
            android.content.Context r6 = r13.requireContext()
            r0 = 2131973916(0x7f13571c, float:1.9584881E38)
            X.DbT.A18(r6, r1, r0)
            r1.setVisibility(r3)
            r0 = 7
        L_0x0141:
            X.ICy r0 = X.C56801ICy.A00(r13, r0)
            A00(r0, r1)
            r0 = 2131428521(0x7f0b04a9, float:1.8478689E38)
            android.view.View r1 = r14.requireViewById(r0)
            r0 = 11
            X.C56801ICy.A01(r1, r0, r13)
            r6 = r14
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            java.lang.String r1 = "H,"
            int r10 = r5.A03
            r0 = 58
            int r11 = r5.A02
            java.lang.String r5 = X.002.A0J(r1, r0, r10, r11)
            X.4gb r1 = new X.4gb
            r1.<init>()
            r1.A0I(r6)
            r0 = 2131443731(0x7f0b4013, float:1.8509538E38)
            r1.A0F(r0, r5)
            r1.A0G(r6)
            android.view.View r0 = r14.requireViewById(r0)
            com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView r0 = (com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView) r0
            r13.A03 = r0
            android.content.Context r6 = r13.requireContext()
            X.0eM r0 = r13.A0F
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.clips.audio.soundsync.view.player.SoundSyncPreviewView r0 = r13.A03
            if (r0 != 0) goto L_0x0194
            java.lang.String r11 = "videoPreviewView"
        L_0x018c:
            X.0qQ.A0F(r11)
        L_0x018f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0194:
            android.view.TextureView r7 = r0.A05
            java.lang.String r9 = r13.A0C
            if (r9 != 0) goto L_0x022f
            java.lang.String r11 = "musicBrowseSessionId"
            goto L_0x018c
        L_0x019d:
            boolean r0 = A04(r13)
            if (r0 == 0) goto L_0x01d4
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x01aa
            r0.setVisibility(r3)
        L_0x01aa:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r13.A08
            if (r1 == 0) goto L_0x01b5
            X.ICy r0 = X.C56801ICy.A00(r13, r7)
        L_0x01b2:
            A00(r0, r1)
        L_0x01b5:
            r13.A0A = r2
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A07
            if (r0 == 0) goto L_0x01f4
            r0.setVisibility(r7)
            com.instagram.common.ui.base.IgButton r6 = r13.A06
            if (r6 == 0) goto L_0x018c
            android.content.Context r1 = r13.requireContext()
            r0 = 2131973916(0x7f13571c, float:1.9584881E38)
            X.DbT.A18(r1, r6, r0)
            com.instagram.common.ui.base.IgButton r1 = r13.A06
            if (r1 == 0) goto L_0x018c
            r0 = 10
            goto L_0x0141
        L_0x01d4:
            com.instagram.common.ui.base.IgButton r6 = r13.A05
            if (r6 == 0) goto L_0x020c
            android.content.Context r1 = r13.requireContext()
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            X.DbT.A18(r1, r6, r0)
            com.instagram.common.ui.base.IgButton r0 = r13.A05
            if (r0 == 0) goto L_0x020c
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgButton r1 = r13.A05
            if (r1 == 0) goto L_0x020c
            r0 = 9
            X.ICy r0 = X.C56801ICy.A00(r13, r0)
            goto L_0x01b2
        L_0x01f4:
            X.0qQ.A0F(r10)
            goto L_0x018f
        L_0x01f8:
            com.instagram.common.ui.base.IgButton r0 = r13.A05
            if (r0 == 0) goto L_0x020c
            r0.setVisibility(r3)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r13.A08
            if (r0 == 0) goto L_0x00bb
            r0.setVisibility(r7)
            goto L_0x00bb
        L_0x0208:
            com.instagram.common.ui.base.IgButton r0 = r13.A05
            if (r0 != 0) goto L_0x010d
        L_0x020c:
            X.0qQ.A0F(r12)
            goto L_0x018f
        L_0x0210:
            java.util.Iterator r1 = r4.iterator()
        L_0x0214:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L_0x0214
            r2 = 0
            java.lang.String r1 = "ClipsAuditionFragment"
            java.lang.String r0 = "selectedMediaList contains an unexpected null element"
            X.0kD.A07(r1, r0, r2)
            X.J5d r0 = X.C59070J5d.A00
            X.018.A1A(r4, r0)
            goto L_0x0021
        L_0x022f:
            X.A7f r5 = new X.A7f
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.A04 = r5
            X.0eM r0 = r13.A0E
            java.lang.Object r10 = r0.getValue()
            X.GgR r10 = (X.C52974GgR) r10
            X.I1z r9 = r10.A0H
            r9.A00 = r4
            java.util.List r8 = r9.A0C
            if (r8 == 0) goto L_0x02a3
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x02a3
            int r1 = r8.size()
            int r0 = r4.size()
            if (r1 != r0) goto L_0x02a3
            int r7 = r4.size()
            r6 = 0
        L_0x025b:
            if (r6 >= r7) goto L_0x02a3
            int r0 = X.C51971G9r.A0I(r8, r6)
            int r5 = java.lang.Math.max(r0, r3)
            java.lang.Object r1 = r4.get(r6)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            java.lang.Object r0 = r4.get(r6)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            int r0 = r0.A03
            int r0 = r0 - r5
            r1.A0A = r5
            r1.A09 = r0
            X.28D r1 = r9.A04
            X.28D r0 = X.28D.A3a
            if (r1 != r0) goto L_0x029e
            com.instagram.common.session.UserSession r11 = r9.A08
            X.0Tu r5 = X.0Tu.A05
            r0 = 36320768895755089(0x81098c00002351, double:3.032738729448304E-306)
            boolean r0 = X.182.A06(r5, r11, r0)
            if (r0 == 0) goto L_0x029e
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r1 = r9.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x0291:
            r1.A01(r0, r4)
            r9.A01 = r2
            X.05G r0 = r9.A0H
            X.AnonymousClass7TF.A1O(r0, r2)
            int r6 = r6 + 1
            goto L_0x025b
        L_0x029e:
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r1 = r9.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0291
        L_0x02a3:
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x02ae
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r1 = r9.A07
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A01(r0, r4)
        L_0x02ae:
            X.6oS r5 = X.C318116oQ.A00(r10)
            X.0nV r2 = r10.A07
            r3 = 0
            r1 = 3
            X.ImR r0 = new X.ImR
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r4, (X.AnonymousClass4D7) r3, (int) r1)
            X.1Eo.A05(r2, r0, r5)
            X.80x r0 = r10.A0F
            X.28D r1 = r0.A00
            X.28D r0 = X.28D.A53
            if (r1 == r0) goto L_0x02d7
            X.8Yz r0 = r10.A08
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x02d7
            X.8A2 r1 = r10.A0D
            java.lang.String r0 = "sound_sync_video_import"
            r1.A0I(r0)
        L_0x02d7:
            X.8A2 r4 = r10.A0D
            X.1QP r2 = r4.A0J
            java.lang.String r1 = "soundsync"
            r0 = 838604575(0x31fc171f, float:7.336794E-9)
            X.AE4 r0 = r2.A01(r1, r0)
            long r0 = r0.A01()
            r4.A09 = r0
            X.0Ud r1 = r10.A0V
            r0 = 34
            X.ImP r0 = X.C58103ImP.A01(r13, r3, r0)
            X.DbZ.A1C(r13, r0, r1)
            X.0r6 r2 = r10.A0N
            r1 = 30
            X.GDq r0 = new X.GDq
            r0.<init>(r10, r13, r3, r1)
            X.DbZ.A1C(r13, r0, r2)
            X.0s1 r2 = X.DbW.A0C(r13)
            r1 = 2131432707(0x7f0b1503, float:1.848718E38)
            X.0eM r0 = r13.A0D
            java.lang.Object r0 = r0.getValue()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r2.A09(r0, r1)
            r2.A00()
            return
        L_0x0317:
            java.lang.String r0 = "Clips Audition Fragment view should be ConstraintLayout"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54144H0o.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(C54144H0o h0o) {
        AnonymousClass0eM r1 = h0o.A0F;
        AnonymousClass8A1.A01(AnonymousClass7TE.A0l(r1)).A0L(C51971G9r.A0g(r1).A04.A0L, AnonymousClass000.A00(4020));
        C39739A7f a7f = h0o.A04;
        if (a7f == null) {
            0qQ.A0F("videoPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        a7f.A02.A05();
        C52974GgR ggR = (C52974GgR) h0o.A0E.getValue();
        27r r3 = ggR.A09;
        29R r2 = r3.A09;
        1Ln A082 = 1Ln.A08(r2.A01);
        if (DbT.A1Y(A082)) {
            A082.A0t("IG_CAMERA_SUGGESTED_AUDIO_NEXT");
            A082.A0r("SUGGESTED_AUDIO_NEXT");
            29R.A00(A082, r2);
            A082.A0a(C279294yP.CLIPS);
            A082.A0b(r2.A04.A09);
            A082.A0T();
            A082.A0d(C59725JVj.PRE_CAPTURE);
            A082.A0n(27x.A08.getModuleName());
            A082.A0c(28t.A06);
            AnonymousClass7TF.A18(A082);
            A082.Cgf();
        }
        r3.A1Z(AnonymousClass80P.SOUND_SYNC);
        AnonymousClass8ZP r0 = ggR.A0C;
        r0.A02.flowMarkPoint(r0.A01, "SOUND_SYNC_NEXT_TAPPED");
        C58099ImL.A01(ggR, C318116oQ.A00(ggR), 18);
    }

    public static final void A02(C54144H0o h0o) {
        AnonymousClass0eM r1 = h0o.A0F;
        AnonymousClass8A1.A01(AnonymousClass7TE.A0l(r1)).A0L(C51971G9r.A0g(r1).A04.A0L, AnonymousClass000.A00(4021));
        C52974GgR ggR = (C52974GgR) h0o.A0E.getValue();
        29R r12 = ggR.A09.A09;
        1Ln A082 = 1Ln.A08(r12.A01);
        if (DbT.A1Y(A082)) {
            A082.A0t("IG_CAMERA_SUGGESTED_AUDIO_SKIP");
            A082.A0r("SUGGESTED_AUDIO_SKIP");
            29R.A00(A082, r12);
            A082.A0a(C279294yP.CLIPS);
            AnonymousClass283 r13 = r12.A04;
            A082.A0b(r13.A09);
            A082.A0W(2);
            A082.A0d(C59725JVj.PRE_CAPTURE);
            A082.A0n(27x.A08.getModuleName());
            int i = 2;
            if (r13.A01 != 2) {
                i = 1;
            }
            A082.A0V(i);
            A082.A0c(28t.A06);
            AnonymousClass7TF.A18(A082);
            A082.Cgf();
        }
        AnonymousClass8ZP r0 = ggR.A0C;
        r0.A02.flowMarkPoint(r0.A01, "SOUND_SYNC_SKIP_TAPPED");
        C52974GgR.A05(ggR);
    }

    public static final void A03(C54144H0o h0o, boolean z) {
        String str;
        ViewGroup viewGroup = h0o.A01;
        if (viewGroup == null) {
            str = "rootView";
        } else {
            0kx r3 = new 0kx(viewGroup);
            while (r3.hasNext()) {
                View view = (View) r3.next();
                SoundSyncPreviewView soundSyncPreviewView = h0o.A03;
                if (soundSyncPreviewView == null) {
                    str = "videoPreviewView";
                } else if (!0qQ.A0K(view, soundSyncPreviewView)) {
                    view.setClickable(!z);
                    if (z) {
                        view.animate().alpha(0.2f).setDuration(900).setInterpolator(new AccelerateInterpolator()).start();
                    } else {
                        view.setAlpha(1.0f);
                    }
                }
            }
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A04(C54144H0o h0o) {
        AnonymousClass0eM r4 = h0o.A0F;
        if (182.A06(0Tu.A05, DbY.A0R(r4), 36329041003036419L) || C355698Qz.A00(AnonymousClass7TE.A0l(r4))) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final boolean onBackPressed() {
        C54607HKq hKq = this.A02;
        if (hKq == null || hKq != C54607HKq.A06) {
            return ((C52974GgR) this.A0E.getValue()).onBackPressed();
        }
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 9583) {
            return;
        }
        if (i2 == 0) {
            C56569I1z i1z = ((C52974GgR) this.A0E.getValue()).A0H;
            AnonymousClass7TF.A1O(i1z.A0G, false);
            i1z.A0A.A0K.A06.A09(i1z.A03);
        } else if (i2 == 9683) {
            requireActivity().setResult(i2);
            DbT.A1K(this);
        } else if (i2 == 9685) {
            C52974GgR ggR = (C52974GgR) this.A0E.getValue();
            ggR.A0A.A00(C356928Vt.PRE_CAPTURE);
            ggR.onCleared();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1515312077);
        C54144H0o.super.onCreate(bundle);
        setModuleNameV2("clips_audition");
        AnonymousClass0fD.A09(731961406, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-450453857);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_sound_sync_audition_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1819065188, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1466391137);
        super.onDestroyView();
        C39739A7f a7f = this.A04;
        if (a7f == null) {
            str = "videoPlayer";
        } else {
            a7f.A02.A07();
            FragmentActivity requireActivity = requireActivity();
            C227182im r0 = this.A09;
            if (r0 == null) {
                str = "windowInsetListener";
            } else {
                C226122ff.A02(requireActivity, r0);
                AnonymousClass0fD.A09(354010970, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-601629304);
        C54144H0o.super.onPause();
        C39739A7f a7f = this.A04;
        if (a7f == null) {
            0qQ.A0F("videoPlayer");
            throw AnonymousClass00P.createAndThrow();
        }
        a7f.A02.A05();
        AnonymousClass0fD.A09(417585009, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(775035308);
        super.onResume();
        if (!((IQE) ((C54126Gzv) this.A0D.getValue()).A04.getValue()).A00) {
            C39739A7f a7f = this.A04;
            if (a7f == null) {
                0qQ.A0F("videoPlayer");
                throw AnonymousClass00P.createAndThrow();
            }
            a7f.A02.A06();
        }
        AnonymousClass0fD.A09(-2093440348, A022);
    }
}
