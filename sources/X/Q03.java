package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

public final class Q03 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public DialogInterface.OnDismissListener A0E;
    public C257603xf A0F;
    public IGAdsIABScreenshotDataDict A0G;
    public IntentAwareAdsInfoIntf A0H;
    public 0jB A0I;
    public 1Xj A0J;
    public AnonymousClass3W1 A0K;
    public AndroidLink A0L;
    public Reel A0M;
    public C250973mM A0N;
    public AnonymousClass3OA A0O;
    public C273384mU A0P;
    public C273494mf A0Q;
    public C13823Tht A0R;
    public C262944Gp A0S;
    public S6e A0T;
    public SHR A0U;
    public C17519VYx A0V;
    public AnonymousClass6a7 A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public int[] A0w;
    public int[] A0x;
    public final Fragment A0y;
    public final FragmentActivity A0z;
    public final UserSession A10;
    public final C270594gz A11;
    public final AnonymousClass4DU A12;
    public final 2EG A13;
    public final AnonymousClass0eM A14 = AnonymousClass0eN.A01(new C20695WxR(this, 6));

    public Q03(Fragment fragment, UserSession userSession, C270594gz r7, AnonymousClass4DU r8, 2EG r9) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TG.A0w(2, fragment, r9, r8);
        this.A10 = userSession;
        this.A0y = fragment;
        this.A13 = r9;
        this.A12 = r8;
        this.A11 = r7;
        this.A0z = fragment.requireActivity();
        this.A09 = -1;
        this.A03 = 0.5f;
        this.A08 = 2;
        this.A0r = true;
    }

    public final void A00(IgImageView igImageView, C271794jb r5, 1Xj r6) {
        0qQ.A0B(r6, 0);
        if (r6.A5H() && igImageView != null) {
            int[] iArr = new int[2];
            igImageView.getLocationInWindow(iArr);
            r5.A03 = "0_0";
            this.A0w = iArr;
            this.A0x = new int[]{igImageView.getWidth(), igImageView.getHeight()};
        }
    }

    public final void A01(1Xj r2) {
        0qQ.A0B(r2, 0);
        this.A0J = r2;
    }

    public final void A02(SourceModelInfoParams sourceModelInfoParams) {
        this.A0B = sourceModelInfoParams.A02;
        this.A09 = sourceModelInfoParams.A00;
        this.A0j = sourceModelInfoParams.A09;
        this.A0i = sourceModelInfoParams.A05;
        this.A0D = sourceModelInfoParams.A03;
        this.A0C = sourceModelInfoParams.A01;
        this.A0g = sourceModelInfoParams.A06;
    }

    public final boolean A03() {
        AnonymousClass3OA r1;
        if (!182.A06(0Tu.A05, this.A10, 36321761034512074L) || (r1 = this.A0O) == null || r1.A0l == null || r1.A01 != AdFormatType.GRID) {
            return false;
        }
        return true;
    }
}
