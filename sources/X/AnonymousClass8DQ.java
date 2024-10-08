package X;

import android.content.Context;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8DQ  reason: invalid class name */
public final class AnonymousClass8DQ implements AnonymousClass874 {
    public final /* synthetic */ AnonymousClass8DL A00;

    public final void DBk(AnonymousClass87G r1, int i, boolean z) {
    }

    public final void DMG(AnonymousClass87G r2, int i) {
        0qQ.A0B(r2, 0);
        this.A00.A03.DMF(r2, i);
    }

    public AnonymousClass8DQ(AnonymousClass8DL r1) {
        this.A00 = r1;
    }

    public final void D8f(int i) {
        AnonymousClass8DL r2 = this.A00;
        AnonymousClass876 r1 = r2.A01;
        if (r1.A01 >= 0 && i < r1.getCount()) {
            r2.A02.A02(i);
        }
    }

    public final void DBi(AnonymousClass87G r8, String str, int i, boolean z) {
        CameraAREffect A002;
        String str2;
        if (r8 == null) {
            0kD.A07("DialArEffectPickerViewManager::onElementSelected", "DialElement is null", (Throwable) null);
            return;
        }
        if (!(!z || (A002 = r8.A00()) == null || (str2 = A002.A0S) == null)) {
            Context context = this.A00.A00;
            Object systemService = context.getSystemService("accessibility");
            0qQ.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            if (2eO.A02(accessibilityManager, true)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
                obtain.getText().add(context.getResources().getString(2131961552, new Object[]{str2}));
                accessibilityManager.sendAccessibilityEvent(obtain);
            }
        }
        this.A00.A03.DBj(r8, str, i, z);
    }
}
