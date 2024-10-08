package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.arcommerce.view.IgCommerceCameraToggleButton;
import org.json.JSONObject;

/* renamed from: X.Vu7  reason: case insensitive filesystem */
public final class C18555Vu7 {
    public Integer A00 = AnonymousClass05K.A01;
    public final X2I A01;
    public final VM2 A02;

    public C18555Vu7(X2I x2i, VM2 vm2, UYH uyh, Integer num) {
        0qQ.A0B(x2i, 1);
        this.A01 = x2i;
        this.A02 = vm2;
        x2i.setOnClick(new C18887WAz(this, 7));
        Context requireContext = uyh.requireContext();
        XDU xdu = XDU.A1i;
        C52337GOf gOf = C52337GOf.FILLED;
        GOg gOg = GOg.SIZE_16;
        Drawable A002 = C14091Tpi.A00(requireContext, xdu, gOg, gOf);
        0qQ.A07(A002);
        Drawable A003 = C14091Tpi.A00(uyh.requireContext(), XDU.A0s, gOg, gOf);
        0qQ.A07(A003);
        IgCommerceCameraToggleButton igCommerceCameraToggleButton = (IgCommerceCameraToggleButton) x2i;
        igCommerceCameraToggleButton.A00 = A002;
        igCommerceCameraToggleButton.A01 = A003;
        ImageView imageView = igCommerceCameraToggleButton.A03;
        if (imageView != null) {
            imageView.setImageDrawable(A003);
        }
        A00(this, num);
    }

    public static final void A00(C18555Vu7 vu7, Integer num) {
        View view;
        Context context;
        int i;
        if (num != vu7.A00) {
            Integer num2 = AnonymousClass05K.A01;
            IgCommerceCameraToggleButton igCommerceCameraToggleButton = (IgCommerceCameraToggleButton) vu7.A01;
            ImageView imageView = igCommerceCameraToggleButton.A03;
            if (num == num2) {
                if (imageView != null) {
                    imageView.setImageDrawable(igCommerceCameraToggleButton.A01);
                }
                view = igCommerceCameraToggleButton.A02;
                if (view != null) {
                    context = view.getContext();
                    i = R.anim.toggle_slide_left;
                }
                vu7.A00 = num;
            }
            if (imageView != null) {
                imageView.setImageDrawable(igCommerceCameraToggleButton.A00);
            }
            view = igCommerceCameraToggleButton.A02;
            if (view != null) {
                context = view.getContext();
                i = R.anim.toggle_slide_right;
            }
            vu7.A00 = num;
            Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
            loadAnimation.setFillAfter(true);
            view.startAnimation(loadAnimation);
            vu7.A00 = num;
        }
    }

    public final void A01() {
        Integer num = AnonymousClass05K.A01;
        A00(this, num);
        UYH uyh = this.A02.A00;
        uyh.A0B.A00();
        if (uyh.A04() != num) {
            C39749A7p A012 = uyh.A01();
            AH4 ah4 = A012.A03;
            if (ah4.A00 != 0) {
                AH4.A01(ah4);
                C40161AUb aUb = ah4.A09;
                aUb.A05(ah4.A0C);
                C40161AUb.A00(aUb).enable(false);
                ah4.A00 = 0;
            }
            A9C a9c = A012.A06;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "onAR3DToggleSwitchStateChanged");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("newValue", "3D");
            jSONObject.put("data", jSONObject2);
            a9c.A00(jSONObject);
            0qQ.A0B(num, 0);
            uyh.A0F = num;
        }
    }
}
