package X;

import android.net.Uri;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.ui.widget.refresh.RefreshableListView;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.ECs  reason: case insensitive filesystem */
public final class C47683ECs extends 1P0 {
    public final /* synthetic */ C54174H1u A00;

    public C47683ECs(C54174H1u h1u) {
        this.A00 = h1u;
    }

    public final void onFail(C268654dm r14) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        int A03 = AnonymousClass0fD.A03(1963320633);
        0qQ.A0B(r14, 0);
        Object A002 = r14.A00();
        String str6 = "";
        String str7 = null;
        if (A002 != null) {
            1XP r0 = (1XP) A002;
            if (r0 != null) {
                str = r0.getErrorMessage();
            } else {
                str = null;
            }
        } else {
            str = str6;
        }
        C54174H1u h1u = this.A00;
        C2366634p r02 = h1u.A01;
        if (r02 != null) {
            r02.A07(str);
        }
        if (A002 == null || !0qQ.A0K(str, AnonymousClass000.A00(3194))) {
            if (h1u.isVisible()) {
                AnonymousClass7TH.A0R(h1u.A0X());
                FragmentActivity requireActivity = h1u.requireActivity();
                String string = h1u.requireArguments().getString(C273654mx.A00(41));
                if (string != null) {
                    str6 = string;
                }
                Uri A09 = DbT.A09(str6);
                List<String> pathSegments = A09.getPathSegments();
                if (pathSegments.size() == 3) {
                    String A19 = AnonymousClass7TE.A19(pathSegments, 0);
                    0qQ.A0A(A19);
                    h1u.A0I.post(new C51418Fto(h1u, A19));
                    C310336ap A0X = DbV.A0X();
                    A0X.A0H = "short_url_feed_post_unavailable";
                    DbS.A19(h1u.requireContext(), A0X, 2131969668);
                    A0X.A06();
                    DbY.A1N(A0X);
                } else {
                    FHB.A02(requireActivity, A09, DbT.A0X(h1u.A0J), "feed_short_url");
                    if (!requireActivity.isFinishing()) {
                        requireActivity.finish();
                    }
                }
            }
            i = -999274445;
        } else {
            DwT dwT = (DwT) A002;
            if (dwT != null) {
                str2 = dwT.A07;
                str3 = dwT.A01;
                str4 = dwT.A06;
                str5 = dwT.A00;
                str7 = dwT.A03;
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
            }
            FragmentActivity requireActivity2 = h1u.requireActivity();
            AnonymousClass0eM r1 = h1u.A0J;
            C309516Yo A0N = DbX.A0N(requireActivity2, r1);
            HashMap A1E = AnonymousClass7TE.A1E();
            if (str7 == null) {
                str7 = str6;
            }
            A1E.put("media_id", str7);
            if (str2 == null) {
                str2 = str6;
            }
            A1E.put(DialogModule.KEY_TITLE, str2);
            if (str3 == null) {
                str3 = str6;
            }
            A1E.put(DevServerEntity.COLUMN_DESCRIPTION, str3);
            if (str4 == null) {
                str4 = str6;
            }
            A1E.put(C46346Dcp.A00(), str4);
            if (str5 == null) {
                str5 = str6;
            }
            A1E.put("blocks_logging_data", str5);
            if (h1u.getActivity() != null) {
                0lg A0X2 = DbT.A0X(r1);
                0qQ.A0B(A0X2, 1);
                02m.A0p.markerStart(291191452, 0);
                02m.A0p.markerAnnotate(291191452, "analytics_module", "ShortURLFeedFragment");
                C46649DiU A04 = C46649DiU.A04("com.bloks.www.instagram.igwb.exp.geogating_viewer", A1E);
                IgBloksScreenConfig A0N2 = DbS.A0N(A0X2);
                A0N2.A0U = str6;
                A0N2.A03 = C47547E7k.A00;
                AnonymousClass3M3 A02 = C49891FBs.A02(A0N2, A04);
                A0N.A0C(h1u);
                A0N.A0D(A02);
                A0N.A04();
            }
            i = -162120685;
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1796914417);
        C54174H1u h1u = this.A00;
        h1u.A0A = false;
        if (h1u.A0X() != null) {
            ListView A0X = h1u.A0X();
            0qQ.A0C(A0X, AnonymousClass000.A00(31));
            ((RefreshableListView) A0X).setIsLoading(false);
        }
        AnonymousClass0fD.A0A(487373149, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1495861137);
        C54174H1u h1u = this.A00;
        h1u.A0A = true;
        if (h1u.A0X() != null) {
            ListView A0X = h1u.A0X();
            0qQ.A0C(A0X, AnonymousClass000.A00(31));
            ((RefreshableListView) A0X).setIsLoading(true);
        }
        AnonymousClass0fD.A0A(-50677479, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-28222499);
        DwT dwT = (DwT) obj;
        int A0D = AnonymousClass7TG.A0D(dwT, -1447835894);
        C54174H1u h1u = this.A00;
        C2366634p r0 = h1u.A01;
        if (r0 != null) {
            r0.A05();
        }
        if (dwT.A08) {
            String str = dwT.A02;
            0qQ.A07(str);
            h1u.A08 = str;
            C54174H1u.A02(h1u);
        } else {
            String str2 = dwT.A04;
            0qQ.A07(str2);
            h1u.A0I.post(new C51418Fto(h1u, str2));
        }
        AnonymousClass0fD.A0A(1350490831, A0D);
        AnonymousClass0fD.A0A(154723024, A03);
    }
}
