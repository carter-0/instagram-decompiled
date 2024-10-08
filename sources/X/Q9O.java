package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;

public final class Q9O extends FrameLayout {
    public static final /* synthetic */ AnonymousClass0YZ[] A02 = {Pxh.A0y(Q9O.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, "getIcon()Lcom/facebookpay/widget/style/Icon;")};
    public ImageView A00;
    public final 0s0 A01 = new C13408TYs((Object) this, 55);

    public Q9O(Context context) {
        super(context, (AttributeSet) null, 0);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_right_add_on_icon, this, false));
        setFocusable(false);
        setImportantForAccessibility(2);
        this.A00 = DbS.A0G(this, R.id.list_cell_right_add_on_icon);
    }

    public final RH3 getIcon() {
        return (RH3) Pxe.A0s(this, this.A01, A02, 0);
    }

    public final void setIcon(RH3 rh3) {
        DbS.A1a(this, rh3, this.A01, A02, 0);
    }
}
