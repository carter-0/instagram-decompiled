package X;

import android.content.Context;
import android.view.View;
import com.instagram.contentnotes.data.immersive.params.ContentNotesCoordinates;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveMimicryParams;

public final class M8W implements Runnable {
    public final /* synthetic */ ContentNotesImmersiveMimicryParams A00;
    public final /* synthetic */ LN3 A01;
    public final /* synthetic */ OI6 A02;

    public M8W(ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams, LN3 ln3, OI6 oi6) {
        this.A01 = ln3;
        this.A02 = oi6;
        this.A00 = contentNotesImmersiveMimicryParams;
    }

    public final void run() {
        LN3 ln3 = this.A01;
        OI6 oi6 = this.A02;
        ContentNotesImmersiveMimicryParams contentNotesImmersiveMimicryParams = this.A00;
        View view = oi6.A01;
        Context context = view.getContext();
        view.setVisibility(0);
        0qQ.A0A(context);
        float A002 = C61380mr.A00(context, 20.0f);
        float A003 = C61380mr.A00(context, 52.0f);
        view.setScaleX(0.5f);
        view.setScaleY(0.5f);
        ContentNotesCoordinates contentNotesCoordinates = contentNotesImmersiveMimicryParams.A01;
        view.setTranslationX((((float) contentNotesCoordinates.A00) - A002) - view.getX());
        view.setTranslationY((((float) contentNotesCoordinates.A01) - A003) - view.getY());
        view.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new C59969Jce(ln3, 0)).start();
    }
}
