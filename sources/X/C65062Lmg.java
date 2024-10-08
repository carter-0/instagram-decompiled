package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker;
import java.util.List;

/* renamed from: X.Lmg  reason: case insensitive filesystem */
public final class C65062Lmg implements MXJ {
    public ViewFlipper A00;
    public FeedColorFilterPicker A01;
    public final C65156LoL A02;
    public final UserSession A03;

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AQD(float f) {
    }

    public final void CN3(ViewGroup viewGroup) {
        String str;
        ViewFlipper viewFlipper = (ViewFlipper) DbX.A0F(viewGroup, 0).inflate(R.layout.photo_edit_tool_view_flipper, viewGroup).requireViewById(R.id.edit_tool_view_flipper);
        this.A00 = viewFlipper;
        if (viewFlipper == null) {
            str = "viewContainer";
        } else {
            FeedColorFilterPicker feedColorFilterPicker = (FeedColorFilterPicker) viewFlipper.requireViewById(R.id.tool_picker);
            this.A01 = feedColorFilterPicker;
            str = "toolPicker";
            if (feedColorFilterPicker != null) {
                feedColorFilterPicker.A05 = new C64946Lkl(this);
                feedColorFilterPicker.setEffects(this.A02.A00, false, this.A03);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean CQZ() {
        return true;
    }

    public final boolean CQa() {
        return true;
    }

    public final /* synthetic */ void Cyg() {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DG2(float f, float f2) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void AJD() {
        this.A02.AJD();
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62562Khs.DEFAULT);
    }

    public final void cancel() {
        this.A02.cancel();
    }

    public C65062Lmg(UserSession userSession, C65156LoL loL) {
        this.A03 = userSession;
        this.A02 = loL;
    }
}
