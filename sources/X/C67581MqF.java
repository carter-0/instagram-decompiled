package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.MqF  reason: case insensitive filesystem */
public final class C67581MqF implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        return this.A00.onTouchEvent(motionEvent);
    }

    public C67581MqF(AnonymousClass4AT r4, C67582MqG mqG, boolean z) {
        this.A00 = new GestureDetector(DbS.A07(mqG), new C67580MqE(r4, mqG, z));
    }
}
