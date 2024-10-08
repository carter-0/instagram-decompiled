package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import java.util.List;

/* renamed from: X.9mX  reason: invalid class name and case insensitive filesystem */
public final class C387639mX extends C353308Hc implements C312366eJ {
    public final C353338Hf A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C387639mX(Context context, UserSession userSession, AnonymousClass8AL r5) {
        super(r5);
        0qQ.A0B(userSession, 3);
        C353338Hf r0 = new C353338Hf(context, new 0xG("AR_COMMERCE_IG"), userSession, this);
        this.A00 = r0;
        this.A00 = r0;
    }

    public final void DX9(PickerConfiguration pickerConfiguration, String str) {
        C353338Hf r1 = this.A00;
        r1.A00 = pickerConfiguration;
        r1.notifyDataSetChanged();
        if (pickerConfiguration != null) {
            int i = pickerConfiguration.mSelectedIndex;
            if (Integer.valueOf(i) != null) {
                r1.A08(i, false);
                AnonymousClass8AL r12 = this.A01;
                NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = r12.A0P;
                0qQ.A07(nestableSnapPickerRecyclerView);
                if (!nestableSnapPickerRecyclerView.isLaidOut()) {
                    nestableSnapPickerRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C64297LYx(i, 2, this, nestableSnapPickerRecyclerView));
                    return;
                } else {
                    r12.A08(i);
                    return;
                }
            }
        }
        0wb.A03("VariantPickerController", "selected index null");
    }

    public final void DXA() {
        this.A00.A01 = null;
        CL9(true);
    }

    public final void DXB(String str, int i) {
        C353338Hf r2 = this.A00;
        r2.A08(i, false);
        r2.A05.ACy(r2.A00);
    }

    public final void DXC(B12 b12, String str) {
        this.A00.A01 = b12;
        Etn(true, true);
    }

    public final void A02(List list) {
        super.A02(list);
        C353338Hf r2 = this.A00;
        B12 b12 = r2.A01;
        if (b12 != null && r2.A02) {
            b12.onPickerItemSelected(r2.A00);
        }
        int i = r2.A00;
        if (r2.A00 != null) {
            r2.A06(i);
        }
    }
}
