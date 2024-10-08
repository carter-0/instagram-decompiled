package X;

import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.84m  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3503984m implements 1wn {
    public final /* synthetic */ C3503684j A00;

    public /* synthetic */ C3503984m(C3503684j r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        HashMap A0E;
        C3503684j r7 = this.A00;
        C359188c9 r13 = (C359188c9) obj;
        int intValue = r13.A01.intValue();
        if (intValue == 0) {
            r7.A07 = true;
            ImageView imageView = r7.A03;
            if (imageView != null) {
                C294975nL.A01(imageView, 0).A0G();
            }
            ViewStub viewStub = r7.A0B;
            if (viewStub != null) {
                viewStub.setVisibility(8);
            }
            r7.A06(false);
            r7.A04(r13.A02, r13.A00);
        } else if (intValue == 1) {
            r7.A07 = true;
            ImageView imageView2 = r7.A03;
            if (imageView2 != null) {
                C294975nL.A01(imageView2, 0).A0G();
            }
            ViewStub viewStub2 = r7.A0B;
            if (viewStub2 != null) {
                viewStub2.setVisibility(8);
            }
            r7.A06(false);
            String str = r13.A03;
            CameraAREffect cameraAREffect = r7.A0E.A05.A09;
            if (cameraAREffect != null) {
                A0E = cameraAREffect.A0F();
            } else {
                A0E = 0Yt.A0E();
            }
            C346167ui r0 = (C346167ui) A0E.get(str);
            if (r0 != null) {
                C3503684j.A02(r7, r0.A01, true);
            }
        } else if (intValue != 3) {
            C3503684j.A01(r7);
            if (r7.A06 == null) {
                IgFrameLayout igFrameLayout = (IgFrameLayout) r7.A0B.inflate();
                r7.A06 = igFrameLayout;
                int paddingLeft = igFrameLayout.getPaddingLeft();
                int i = r7.A09;
                igFrameLayout.setPadding(paddingLeft + i, r7.A06.getPaddingTop(), r7.A06.getPaddingRight() + i, r7.A06.getPaddingBottom());
                r7.A03 = (ImageView) r7.A06.findViewById(R.id.ar_effect_instruction_image);
            }
            r7.A03.getClass();
            C294975nL.A01(r7.A03, 0).A0G();
            List list = r13.A04;
            list.getClass();
            List list2 = r13.A06;
            list2.getClass();
            List list3 = r13.A05;
            list3.getClass();
            0nY.A00().ATE(new C15877Uk1(r7, r13.A02, list, list2, list3));
        } else {
            r7.A05(true);
        }
    }
}
