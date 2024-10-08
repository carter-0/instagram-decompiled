package X;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.File;
import java.io.IOException;

/* renamed from: X.9rO  reason: invalid class name and case insensitive filesystem */
public final class C390509rO extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelMentionReshareCameraFragment";
    public 28D A00 = 28D.A5J;
    public 1Xj A01;
    public File A02;
    public File A03;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        File file;
        String str;
        File file2;
        0qQ.A0B(viewGroup, 0);
        1Xj r6 = this.A01;
        String str2 = null;
        if (r6 == null || (file = this.A03) == null) {
            return null;
        }
        int i = 1;
        if (r6.CeS()) {
            i = 3;
        }
        Medium A032 = C282665Eg.A03(file, i, 0);
        Context requireContext = requireContext();
        float A09 = (float) 0nA.A09(requireContext);
        float A08 = (float) 0nA.A08(requireContext);
        RectF A0C = AnonymousClass7TF.A0C(A09, A08);
        RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
        try {
            file2 = file;
            String canonicalPath = file.getCanonicalPath();
            file2 = canonicalPath;
            str = canonicalPath;
        } catch (IOException unused) {
            str = file2.getAbsolutePath();
        }
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        A002.A0B = this.A00;
        A002.A0O = this;
        AnonymousClass80D.A02(A0C, rectF, A002);
        A002.A3y = true;
        AnonymousClass80D.A0A(A002);
        A002.A0P = A032;
        A002.A0w = null;
        A002.A0u = new C3498482b(AnonymousClass7TE.A0k(this), r6, str, true);
        CreativeConfigIntf AsO = r6.A0C.AsO();
        if (AsO != null) {
            str2 = AsO.B3W();
        }
        A002.A2G = str2;
        A002.A3Q = true;
        A002.A2e = "activity_tab";
        A002.A3U = true;
        File file3 = this.A02;
        if (file3 != null) {
            Medium A033 = C282665Eg.A03(file3, 1, 0);
            A002.A1C = r6;
            A002.A00 = 0;
            A002.A0P = A033;
            A002.A0w = null;
            A002.A3q = false;
            if (A032.CeS()) {
                A002.A0Q = A032;
                A002.A3t = false;
            }
        }
        return A002;
    }

    public final String getModuleName() {
        return "reel_mention_reshare_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        28D r1;
        File file;
        File file2;
        String str;
        File file3;
        int A022 = AnonymousClass0fD.A02(-1820177067);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get(AnonymousClass000.A00(2454));
        if (!(obj instanceof 28D) || (r1 = (28D) obj) == null) {
            r1 = 28D.A5J;
        }
        this.A00 = r1;
        String string = requireArguments.getString(AnonymousClass000.A00(2456));
        String string2 = requireArguments.getString(AnonymousClass000.A00(2455));
        String string3 = requireArguments.getString(AnonymousClass000.A00(2453));
        this.A01 = AnonymousClass7TH.A0B(this, string);
        if (string2 != null) {
            file = AnonymousClass7TE.A0t(string2);
        } else {
            file = null;
        }
        this.A03 = file;
        if (string3 != null) {
            file2 = AnonymousClass7TE.A0t(string3);
        } else {
            file2 = null;
        }
        this.A02 = file2;
        AnonymousClass8HT A002 = AnonymousClass8HS.A00(AnonymousClass7TE.A0k(this), (C357638Yz) null);
        if (this.A01 == null || (file3 = this.A03) == null || !file3.exists()) {
            if (this.A01 == null) {
                str = "missing_media";
            } else {
                File file4 = this.A03;
                if (file4 == null) {
                    str = "missing_media_file";
                } else if (!file4.exists()) {
                    str = "medial_file_does_not_exist";
                } else {
                    str = RealtimeConstants.SEND_FAIL;
                }
            }
            A002.A02(002.A0R("open_reshare_fragment-", str));
        } else {
            A002.A02 = A002.A03.A02(17315248, A002.A02);
        }
        AnonymousClass0fD.A09(-175947106, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-385759410);
        super.onResume();
        File file = this.A03;
        if (this.A01 == null || file == null || !file.exists()) {
            VJ3.A00(this);
        }
        AnonymousClass0fD.A09(1364105683, A022);
    }
}
