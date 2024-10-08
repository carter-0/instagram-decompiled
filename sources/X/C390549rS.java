package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.user.model.User;
import java.io.File;

/* renamed from: X.9rS  reason: invalid class name and case insensitive filesystem */
public final class C390549rS extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelClipsShareFragment";
    public AnonymousClass9YD A00;
    public 28D A01 = 28D.A5J;
    public ReelsVisualRepliesModel A02;
    public ClipsCelebrationReshareViewModel A03;
    public 1Xj A04;
    public PendingRecipient A05;
    public AnonymousClass8D6 A06;
    public File A07;
    public String A08;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        boolean A062;
        1sP r14;
        float A0l;
        Bitmap A022;
        ViewGroup viewGroup2 = viewGroup;
        0qQ.A0B(viewGroup2, 0);
        1Xj r2 = this.A04;
        if (r2 != null) {
            File file = this.A07;
            if (file == null) {
                0qQ.A0F("file");
                throw AnonymousClass00P.createAndThrow();
            }
            Medium A032 = C282665Eg.A03(file, 3, 0);
            UserSession A0k = AnonymousClass7TE.A0k(this);
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, A0k, 36323225617509388L)) {
                1Av A002 = 1Au.A00(A0k);
                A062 = AnonymousClass7TG.A1a(A002, A002.A69, 1Av.A8a, 485);
            } else {
                A062 = 182.A06(r7, A0k, 36323225617574925L);
            }
            User A2A = r2.A2A(A0k);
            if (A2A != null) {
                User B9t = r2.A0C.B9t();
                String A30 = r2.A30();
                if (A30 != null) {
                    int A1B = (int) r2.A1B();
                    C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
                    if (clipsMetadata != null) {
                        r14 = clipsMetadata.FDk(1E4.A00(A0k));
                    } else {
                        r14 = null;
                    }
                    C246623eu A1S = r2.A1S();
                    if (A1S != null) {
                        A0l = ((float) A1S.A01) / ((float) A1S.A00);
                    } else {
                        A0l = r2.A0l();
                    }
                    float f = A0l;
                    AnonymousClass82f r13 = new AnonymousClass82f(r14, A2A, B9t, A30, f, 1.0f, 0, 0, A1B, A062, 182.A06(r7, A0k, 36323225617312778L));
                    r13.A03 = r2;
                    Context requireContext = requireContext();
                    float A09 = (float) 0nA.A09(requireContext);
                    float A082 = (float) 0nA.A08(requireContext);
                    RectF A0C = AnonymousClass7TF.A0C(A09, A082);
                    RectF rectF = new RectF(0.0f, 0.0f, A09, A082);
                    AnonymousClass80D A003 = AnonymousClass80D.A00();
                    AnonymousClass80D.A0F(A003, this);
                    AnonymousClass80I r4 = AnonymousClass80H.A02;
                    UserSession userSession = this.A00;
                    0qQ.A06(userSession);
                    AnonymousClass80D.A09(userSession, r4, A003, this);
                    A003.A09 = viewGroup2;
                    A003.A0B = this.A01;
                    A003.A0O = this;
                    AnonymousClass80D.A02(A0C, rectF, A003);
                    A003.A3y = true;
                    AnonymousClass80E r8 = AnonymousClass80E.ALL;
                    A003.A0y = r8;
                    A003.A3g = true;
                    A003.A0P = A032;
                    A003.A0w = null;
                    A003.A15 = r13;
                    A003.A14 = this.A03;
                    A003.A0j = this.A02;
                    A003.A1T = this.A06;
                    A003.A3Q = true;
                    if (182.A06(r7, AnonymousClass7TE.A0k(this), 36323225617050631L)) {
                        String str = this.A08;
                        if (str != null) {
                            File A0t = AnonymousClass7TE.A0t(str);
                            long currentTimeMillis = System.currentTimeMillis();
                            String canonicalPath = A0t.getCanonicalPath();
                            0qQ.A07(canonicalPath);
                            Medium medium = new Medium(Uri.fromFile(A0t), canonicalPath, 0, 1, 0, 0, AnonymousClass7TE.A0P(currentTimeMillis), currentTimeMillis);
                            A003.A1C = r2;
                            A003.A00 = 0;
                            A003.A0P = medium;
                            A003.A0w = null;
                            A003.A0Q = A032;
                            A003.A3q = false;
                            if (182.A06(r7, AnonymousClass7TE.A0k(this), 36323225617247241L)) {
                                Context context = getContext();
                                AnonymousClass802 r22 = null;
                                if (!(context == null || (A022 = 1MF.A02(context, medium.A02())) == null)) {
                                    r22 = new C39889ADn(context).A01();
                                    r22.A0E = false;
                                    C353818Jf r10 = new C353818Jf();
                                    r10.A02(A022.getPixel(0, 0), A022.getPixel(0, A022.getHeight() - 1));
                                    r22.A0A = AnonymousClass7TE.A1I(new TextColorScheme(r10));
                                    if (AnonymousClass7TF.A1Y(r13.A07.A02(), true)) {
                                        r22.A02 = AnonymousClass7TF.A03(context, R.attr.igds_color_media_background);
                                        r22.A03 = 1;
                                        r22.A01 = 1;
                                    }
                                }
                                A003.A0P = medium;
                                A003.A0w = r22;
                            }
                        }
                    }
                    PendingRecipient pendingRecipient = this.A05;
                    if (pendingRecipient != null) {
                        A003.A1S = pendingRecipient;
                        A003.A0y = AnonymousClass80E.GROUP_PROFILE;
                        return A003;
                    }
                    A003.A0y = r8;
                    return A003;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        return null;
    }

    public final String getModuleName() {
        return "reel_clps_reshare_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        if (25x.A00(userSession).A01.A00 == C299715vi.A00) {
            if (!AnonymousClass7TF.A0R(0Tu.A05, this.A00, 36319858362752697L).booleanValue()) {
                07U r3 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new C58107ImT((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
                AnonymousClass9YD r0 = this.A00;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.UZw, X.07g, androidx.fragment.app.Fragment, X.9rS] */
    public final void onCreate(Bundle bundle) {
        28D r1;
        int A022 = AnonymousClass0fD.A02(-1103153918);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(AnonymousClass000.A00(210));
        AnonymousClass8D6 r2 = null;
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A01 = r1;
        this.A04 = AnonymousClass7TH.A0B(this, requireArguments.getString(AnonymousClass000.A00(212)));
        this.A07 = AnonymousClass7TE.A0t(C320236s2.A01(requireArguments, AnonymousClass000.A00(211)));
        this.A03 = (ClipsCelebrationReshareViewModel) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_SHARE_CELEBRATION_VIEW_MODEL");
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        this.A00 = new 2YN(new C385639jI(userSession), this).A00(AnonymousClass9YD.class);
        this.A02 = (ReelsVisualRepliesModel) requireArguments.getParcelable("ClipsConstants.ARG_CLIPS_COMMENT_SHARE_MODEL");
        this.A05 = (PendingRecipient) requireArguments.getParcelable(AnonymousClass000.A00(57));
        this.A08 = requireArguments.getString(AnonymousClass000.A00(2153));
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_ACHIEVEMENTS_STICKER_URL");
        if (string != null) {
            r2 = new AnonymousClass8D6(string);
        }
        this.A06 = r2;
        UserSession userSession2 = this.A00;
        0qQ.A06(userSession2);
        PendingMediaStore A002 = 28K.A00(userSession2);
        File file = this.A07;
        if (file == null) {
            0qQ.A0F("file");
            throw AnonymousClass00P.createAndThrow();
        }
        String path = file.getPath();
        0qQ.A07(path);
        A002.A08.add(path);
        AnonymousClass0fD.A09(151745034, A022);
    }
}
