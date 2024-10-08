package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Sbd  reason: case insensitive filesystem */
public final class C11516Sbd implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00 = 0;
    public int A01 = 0;
    public boolean A02 = false;
    public final int A03;
    public final Rect A04;
    public final /* synthetic */ C7372Q9d A05;

    public C11516Sbd(C7372Q9d q9d) {
        this.A05 = q9d;
        C11414SSm.A04(q9d.getContext().getApplicationContext());
        this.A04 = AnonymousClass7TE.A0W();
        this.A03 = (int) W2U.A01(60.0f);
    }

    private void A01() {
        boolean isVisible;
        WritableNativeMap A002;
        String str;
        C7372Q9d q9d = this.A05;
        View rootView = q9d.getRootView();
        Rect rect = this.A04;
        rootView.getWindowVisibleDisplayFrame(rect);
        WindowInsets rootWindowInsets = q9d.getRootView().getRootWindowInsets();
        if (rootWindowInsets != null && (isVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) != this.A02) {
            this.A02 = isVisible;
            if (isVisible) {
                int i = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
                ViewGroup.LayoutParams layoutParams = q9d.getRootView().getLayoutParams();
                0Sd.A02(layoutParams instanceof WindowManager.LayoutParams);
                int i2 = ((WindowManager.LayoutParams) layoutParams).softInputMode;
                int i3 = rect.bottom;
                if (i2 == 48) {
                    i3 -= i;
                }
                A002 = A00(Pxe.A01(i3), Pxe.A01(rect.left), Pxe.A01(rect.width()), Pxe.A01(i));
                str = "keyboardDidShow";
            } else {
                A002 = A00(Pxe.A01(rect.height()), 0.0d, Pxe.A01(rect.width()), 0.0d);
                str = "keyboardDidHide";
            }
            if (q9d.A05 != null) {
                q9d.getCurrentReactContext().A0E(str, A002);
            }
        }
    }

    public final void onGlobalLayout() {
        int i;
        WritableNativeMap A002;
        String str;
        DisplayCutout displayCutout;
        DeviceInfoModule deviceInfoModule;
        String str2;
        double d;
        C7372Q9d q9d = this.A05;
        if (q9d.A05() && q9d.A0A) {
            if (Build.VERSION.SDK_INT >= 30) {
                A01();
            } else {
                View rootView = q9d.getRootView();
                Rect rect = this.A04;
                rootView.getWindowVisibleDisplayFrame(rect);
                WindowInsets rootWindowInsets = q9d.getRootView().getRootWindowInsets();
                if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                    i = 0;
                } else {
                    i = displayCutout.getSafeInsetTop();
                }
                int i2 = C11414SSm.A00().heightPixels;
                int i3 = rect.bottom;
                int i4 = (i2 - i3) + i;
                int i5 = this.A01;
                if (i5 != i4 && i4 > this.A03) {
                    this.A01 = i4;
                    this.A02 = true;
                    A002 = A00(Pxe.A01(i3), Pxe.A01(rect.left), Pxe.A01(rect.width()), Pxe.A01(this.A01));
                    str = "keyboardDidShow";
                } else if (i5 != 0 && i4 <= this.A03) {
                    this.A01 = 0;
                    this.A02 = false;
                    A002 = A00(Pxe.A01(rect.height()), 0.0d, Pxe.A01(rect.width()), 0.0d);
                    str = "keyboardDidHide";
                }
                if (q9d.A05 != null) {
                    q9d.getCurrentReactContext().A0E(str, A002);
                }
            }
            Context context = q9d.getContext();
            int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.A00 != rotation) {
                this.A00 = rotation;
                C11414SSm.A03(context.getApplicationContext());
                boolean z = true;
                if (rotation == 0) {
                    d = 0.0d;
                    str2 = "portrait-primary";
                    z = false;
                } else if (rotation == 1) {
                    d = -90.0d;
                    str2 = "landscape-primary";
                } else if (rotation == 2) {
                    d = 180.0d;
                    str2 = "portrait-secondary";
                    z = false;
                } else if (rotation == 3) {
                    d = 90.0d;
                    str2 = "landscape-secondary";
                }
                WritableNativeMap A0U = Pxe.A0U();
                A0U.putString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
                A0U.putDouble("rotationDegrees", d);
                A0U.putBoolean("isLandscape", z);
                if (q9d.A05 != null) {
                    q9d.getCurrentReactContext().A0E("namedOrientationDidChange", A0U);
                }
            }
            Q6H currentReactContext = q9d.getCurrentReactContext();
            if (currentReactContext != null && (deviceInfoModule = (DeviceInfoModule) currentReactContext.A03(DeviceInfoModule.class)) != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }
    }

    public static WritableNativeMap A00(double d, double d2, double d3, double d4) {
        WritableNativeMap A0U = Pxe.A0U();
        WritableNativeMap A0U2 = Pxe.A0U();
        A0U2.putDouble(IgReactMediaPickerNativeModule.HEIGHT, d4);
        A0U2.putDouble("screenX", d2);
        A0U2.putDouble(IgReactMediaPickerNativeModule.WIDTH, d3);
        A0U2.putDouble("screenY", d);
        A0U.putMap("endCoordinates", A0U2);
        A0U.putString("easing", "keyboard");
        A0U.putDouble(TraceFieldType.Duration, 0.0d);
        return A0U;
    }
}
