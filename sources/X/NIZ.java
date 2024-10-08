package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.io.File;
import java.util.List;

public final class NIZ extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ThreadDetailsCustomGroupNameAndImageFragment";
    public C55952HqG A00;
    public final OJf A01 = new OJf(this);
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03;
    public final String A04 = __redex_internal_original_name;

    public final void beforeOnCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        0qQ.A0B(layoutInflater, 0);
        super.beforeOnCreateView(layoutInflater, viewGroup, bundle);
        AnonymousClass0eM r4 = this.A02;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        String string = requireArguments().getString("analytics_entrypoint");
        if (string == null) {
            string = "";
        }
        C254793t3 A002 = OXL.A00(requireArguments(), "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID");
        if (A002 != null) {
            this.A00 = new C55952HqG(this, A0l, string, C300965yF.A07(A002));
            if (182.A06(0Tu.A05, DbT.A0X(r4), 36329775442313542L)) {
                C55952HqG hqG = this.A00;
                if (hqG == null) {
                    0qQ.A0F("logger");
                    throw AnonymousClass00P.createAndThrow();
                }
                hqG.A00(C54682HOn.IMAGINE_BUTTON_IMPRESSION, (C62639Kk1) null);
                05G r42 = ((C53027GhI) this.A03.getValue()).A06;
                do {
                    value = r42.getValue();
                } while (!r42.AIY(value, C53391GnO.A00((C53391GnO) value, (ImageUrl) null, (File) null, (String) null, (String) null, 00k.A0S((Iterable) C53027GhI.A0A.getValue(), AnonymousClass7TE.A1I(new HAD(AnonymousClass05K.A0C, R.drawable.instagram_gen_ai_pano_outline_24, 2131964139))), 247, false)));
                return;
            }
            return;
        }
        throw C66580MXl.A0p();
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public NIZ() {
        C73902Pld pld = new C73902Pld(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73902Pld(new C73902Pld(this, 46), 47));
        this.A03 = DbS.A0I(new C73902Pld(A002, 48), pld, new C73665Phe(40, A002, (Object) null), DbS.A0z(C53027GhI.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Object value;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            C53027GhI ghI = (C53027GhI) this.A03.getValue();
            Context requireContext = requireContext();
            String action = intent.getAction();
            if (action != null) {
                Uri A09 = DbT.A09(action);
                if (A09.getScheme() != null || (A09 = 0cp.A03(002.A0R("file://", action))) != null) {
                    Bitmap A002 = C64366Lai.A00(requireContext, A09, ghI.A00, 1);
                    if (A002 == null) {
                        0wb.A03("ThreadDetailCustomGroupNameAndImageViewModel", "Failed to load group photo bitmap");
                        return;
                    }
                    A002.getWidth();
                    File A042 = 0mb.A04(requireContext);
                    1MF.A0M(A002, A042);
                    A002.recycle();
                    05G r2 = ghI.A06;
                    do {
                        value = r2.getValue();
                    } while (!r2.AIY(value, C53391GnO.A00((C53391GnO) value, (ImageUrl) null, A042, (String) null, (String) null, (List) null, 222, true)));
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-512642427);
        ComposeView A0H = DbV.A0H(this, new C59110J6s(this, 38), 1584209244);
        AnonymousClass0fD.A09(254577466, A022);
        return A0H;
    }
}
