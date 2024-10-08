package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.HaU  reason: case insensitive filesystem */
public abstract class C54997HaU {
    public static final GQ0 A00(MotionEvent motionEvent, View view) {
        AnonymousClass7TG.A1N(view, motionEvent);
        return new GQ0(view.getWidth(), view.getHeight(), motionEvent.getX(), motionEvent.getY());
    }
}
