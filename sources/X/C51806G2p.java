package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

/* renamed from: X.G2p  reason: case insensitive filesystem */
public final class C51806G2p extends 0Yg implements 0sP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C273434mZ A03;
    public final /* synthetic */ AnonymousClass6ST A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51806G2p(Context context, Fragment fragment, UserSession userSession, C273434mZ r5, AnonymousClass6ST r6, String str, String str2) {
        super(1);
        this.A01 = fragment;
        this.A04 = r6;
        this.A02 = userSession;
        this.A00 = context;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        File file;
        File A0T = Dba.A0T(obj);
        Fragment fragment = this.A01;
        if (!C49103EpS.A00(fragment)) {
            AnonymousClass6ST r1 = this.A04;
            if (r1.isShowing()) {
                r1.dismiss();
            }
            UserSession userSession = this.A02;
            FragmentActivity requireActivity = fragment.requireActivity();
            Context context = this.A00;
            String str2 = this.A05;
            String str3 = this.A06;
            try {
                file = A0T;
                String canonicalPath = A0T.getCanonicalPath();
                file = canonicalPath;
                str = canonicalPath;
            } catch (IOException e) {
                0wb.A06(002.A0R(str3, "_reshareToStory"), AnonymousClass000.A00(2255), e);
                str = file.getAbsolutePath();
            }
            0qQ.A0A(str);
            C273434mZ r10 = this.A03;
            Bundle A0C = DbY.A0C(AnonymousClass000.A00(2455), str, AnonymousClass7TE.A1L(AnonymousClass000.A00(2454), 28D.A2V), AnonymousClass7TE.A1L(AnonymousClass000.A00(2456), str2));
            if (1NM.A03(userSession)) {
                1Xj A0U = DbV.A0U(userSession, str2);
                if (A0U != null) {
                    FZD fzd = new FZD(3, requireActivity, context, A0C, userSession, r10);
                    LTL.A04(requireActivity, A0U.A1n(requireActivity), fzd, 2RR.A01(), AnonymousClass7TF.A03(context, R.attr.igds_color_media_background), true);
                }
            } else {
                AnonymousClass6W8 A022 = AnonymousClass6W8.A02(requireActivity, A0C, userSession, TransparentModalActivity.class, C273654mx.A00(378));
                A022.A0E(r10);
                A022.A0C(context);
            }
        }
        return C60340gF.A00;
    }
}
