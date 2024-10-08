package X;

import android.view.View;
import com.instagram.creation.capture.assetpicker.cutout.CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class KIQ extends AnonymousClass0mG {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C64965Ll4 A01;
    public final /* synthetic */ IgdsMediaButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIQ(View view, C64965Ll4 ll4, IgdsMediaButton igdsMediaButton) {
        super(500);
        this.A02 = igdsMediaButton;
        this.A01 = ll4;
        this.A00 = view;
    }

    public final void A00(View view) {
        this.A02.setEnabled(false);
        C64965Ll4 ll4 = this.A01;
        C64965Ll4.A03(ll4);
        if (ll4.A0D == AnonymousClass05K.A15 || !G9t.A1b(ll4.A0Y)) {
            1Eo.A05(new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, ll4, new MJ0(ll4, 45)), new C66163MGa(this.A00, ll4, (AnonymousClass4D7) null, 12), ll4.A0N);
            return;
        }
        AnonymousClass0xx r4 = ll4.A0N;
        1Eo.A01(AnonymousClass05K.A00, new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, ll4, new MJ0(ll4, 44)), new C66163MGa(this.A00, ll4, (AnonymousClass4D7) null, 11), r4);
    }
}
