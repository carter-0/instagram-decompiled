package X;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.model.mediatype.ProductType;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.9rU  reason: invalid class name and case insensitive filesystem */
public final class C390569rU extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelFeedPostShareFragment";
    public int A00;
    public RectF A01;
    public RectF A02;
    public 28D A03;
    public ReelsVisualRepliesModel A04;
    public ClipsCelebrationReshareViewModel A05;
    public 1Xj A06;
    public MusicOverlayStickerModel A07;
    public PendingRecipient A08;
    public File A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final C41837B2s A0E = new WUP(this, 18);
    public final AnonymousClass0eM A0F;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        Medium medium;
        AnonymousClass80D A002;
        String str;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        1Xj r3 = this.A06;
        if (r3 == null) {
            return null;
        }
        if (r3.A5D()) {
            r3 = r3.A1c(this.A00);
            0qQ.A0A(r3);
        }
        if (r3.A1v() == ProductType.IGTV) {
            1Xj r4 = this.A06;
            if (r4 == null || (str = this.A0B) == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            File file = this.A09;
            if (file != null) {
                String absolutePath = file.getAbsolutePath();
                0qQ.A07(absolutePath);
                long A0P = AnonymousClass7TE.A0P(currentTimeMillis);
                File file2 = this.A09;
                if (file2 != null) {
                    Medium medium2 = new Medium(Uri.fromFile(file2), absolutePath, 0, 1, 0, 0, A0P, currentTimeMillis);
                    Medium A032 = C282665Eg.A03(AnonymousClass7TE.A0t(str), 3, 0);
                    Context requireContext = requireContext();
                    int A092 = 0nA.A09(requireContext);
                    int A082 = 0nA.A08(requireContext);
                    float f = (float) A092;
                    float f2 = (float) A082;
                    RectF A0C2 = AnonymousClass7TF.A0C(f, f2);
                    RectF rectF = new RectF(0.0f, 0.0f, f, f2);
                    A002 = AnonymousClass80D.A00();
                    AnonymousClass80D.A0F(A002, this);
                    AnonymousClass80I r7 = AnonymousClass80H.A02;
                    UserSession userSession = this.A00;
                    0qQ.A06(userSession);
                    AnonymousClass80D.A09(userSession, r7, A002, this);
                    A002.A09 = viewGroup2;
                    A002.A0B = this.A03;
                    A002.A0O = this;
                    AnonymousClass80D.A02(A0C2, rectF, A002);
                    A002.A3y = true;
                    A002.A3g = true;
                    A002.A0P = medium2;
                    A002.A0w = null;
                    A002.A0Q = A032;
                    A002.A1C = this.A06;
                    A002.A00 = 0;
                    A002.A0o = new C3498682d(this.A00, r4, A092, A082);
                    A002.A3Q = true;
                }
            }
            0qQ.A0F("presetMediumFile");
            throw AnonymousClass00P.createAndThrow();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        File file3 = this.A09;
        AnonymousClass8D6 r2 = null;
        if (file3 != null) {
            String absolutePath2 = file3.getAbsolutePath();
            0qQ.A07(absolutePath2);
            long A0P2 = AnonymousClass7TE.A0P(currentTimeMillis2);
            File file4 = this.A09;
            if (file4 != null) {
                Medium medium3 = new Medium(Uri.fromFile(file4), absolutePath2, 0, 1, 0, 0, A0P2, currentTimeMillis2);
                String str2 = this.A0B;
                if (str2 != null) {
                    medium = C282665Eg.A03(AnonymousClass7TE.A0t(str2), 3, 0);
                } else {
                    medium = null;
                }
                String str3 = this.A0A;
                if (str3 != null) {
                    r2 = new AnonymousClass8D6(str3);
                }
                A002 = AnonymousClass80D.A00();
                AnonymousClass80D.A0C(A002, this.A0E, this);
                AnonymousClass80D.A09(AnonymousClass7TE.A0k(this), AnonymousClass80H.A02, A002, this);
                A002.A09 = viewGroup2;
                A002.A0B = this.A03;
                A002.A0O = this;
                AnonymousClass80D.A02(this.A01, this.A02, A002);
                A002.A3y = true;
                A002.A3g = true;
                A002.A0P = medium3;
                A002.A0w = null;
                A002.A0Q = medium;
                1Xj r32 = this.A06;
                int i = this.A00;
                A002.A1C = r32;
                A002.A00 = i;
                A002.A3Q = true;
                A002.A3W = this.A0D;
                A002.A2i = this.A0C;
                A002.A14 = this.A05;
                A002.A0j = this.A04;
                A002.A1R = this.A07;
                A002.A1T = r2;
                A002.A3U = false;
            }
        }
        0qQ.A0F("presetMediumFile");
        throw AnonymousClass00P.createAndThrow();
        PendingRecipient pendingRecipient = this.A08;
        if (pendingRecipient != null) {
            A002.A0y = AnonymousClass80E.GROUP_PROFILE;
            A002.A1S = pendingRecipient;
            return A002;
        }
        A002.A0y = AnonymousClass80E.ALL;
        return A002;
    }

    public final String getModuleName() {
        return "reel_feed_post_share_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A06 != null) {
            if (!AnonymousClass7TF.A0R(0Tu.A05, this.A00, 36319858362752697L).booleanValue() && 0qQ.A0K(25x.A00(AnonymousClass7TE.A0k(this)).A01.A00, C299715vi.A00)) {
                07U r3 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new C58107ImT((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
                ((AnonymousClass9YD) this.A0F.getValue()).A00();
            }
        }
    }

    public C390569rU() {
        MJ2 mj2 = new MJ2(this, 1);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20607Wvo(new C20607Wvo(this, 48), 49));
        this.A0F = new C227862kA(new MJ2(A002, 0), mj2, new MJ5(1, (Object) null, A002), new 0Yh(AnonymousClass9YD.class));
        this.A03 = 28D.A5J;
    }

    public final void onCreate(Bundle bundle) {
        28D r3;
        int A022 = AnonymousClass0fD.A02(-194817003);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Object obj = bundle2.get("ReelFeedPostShareFragment.ARGUMENTS_KEY_ENTRY_POINT");
            if (!(obj instanceof 28D) || (r3 = (28D) obj) == null) {
                r3 = 28D.A5J;
            }
            this.A03 = r3;
            this.A01 = (RectF) bundle2.getParcelable(AnonymousClass000.A00(468));
            this.A02 = (RectF) bundle2.getParcelable(AnonymousClass000.A00(469));
            this.A0D = bundle2.getBoolean("ARGUMENTS_MEDIA_SHARED_TO_FEED", false);
            this.A06 = AnonymousClass7TH.A0B(this, bundle2.getString("ReelFeedPostShareFragment.ARGUMENTS_KEY_MEDIA_ID"));
            this.A00 = bundle2.getInt("ReelFeedPostShareFragment.ARGUMENTS_CAROUSEL_INDEX");
            this.A09 = AnonymousClass7TE.A0t(C320236s2.A01(bundle2, "ReelFeedPostShareFragment.ARGUMENTS_KEY_FILE_PATH"));
            this.A0C = bundle2.getString(AnonymousClass000.A00(470));
            this.A0B = bundle2.getString("feed_post_share_media_file_path");
            this.A05 = (ClipsCelebrationReshareViewModel) bundle2.getParcelable("celebration_reshare_view_model");
            this.A08 = (PendingRecipient) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_TARGET_GROUP_PROFILE");
            this.A04 = (ReelsVisualRepliesModel) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_COMMENT_SHARE_MODEL");
            this.A0A = bundle2.getString("ReelFeedPostShareFragment.ARGUMENTS_ACHIEVEMENT_STICKER_URL");
            this.A07 = (MusicOverlayStickerModel) bundle2.getParcelable("ReelFeedPostShareFragment.ARGUMENTS_MUSIC_METADATA");
            AnonymousClass0fD.A09(47197206, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w(AnonymousClass000.A00(459));
        AnonymousClass0fD.A09(916010845, A022);
        throw A0w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.exists() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r2 = this;
            r0 = 1002040244(0x3bb9ebb4, float:0.00567385)
            int r1 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.1Xj r0 = r2.A06
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r2.A09
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "presetMediumFile"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            X.VJ3.A00(r2)
        L_0x0025:
            r0 = -615210199(0xffffffffdb54a329, float:-5.9852092E16)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390569rU.onResume():void");
    }
}
