package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import com.facebook.CustomTabMainActivity;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment;

public final class T72 implements 1wn {
    public final int A00;
    public final Object A01;

    public T72(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03;
        int i;
        AppearanceModule appearanceModule;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(2034340209);
                C12789T6z t6z = (C12789T6z) obj;
                int A032 = AnonymousClass0fD.A03(-1797812862);
                0qQ.A0B(t6z, 0);
                int intValue = t6z.A00.intValue();
                R9G r9g = (R9G) this.A01;
                if (intValue != 0) {
                    C11254SHo sHo = r9g.A00;
                    if (sHo != null) {
                        sHo.A01();
                    }
                    0qQ.A0F("selfieViewProvider");
                    throw AnonymousClass00P.createAndThrow();
                }
                C11254SHo sHo2 = r9g.A00;
                if (sHo2 != null) {
                    sHo2.A04 = true;
                }
                0qQ.A0F("selfieViewProvider");
                throw AnonymousClass00P.createAndThrow();
                AnonymousClass0fD.A0A(1506351398, A032);
                i = -1908275007;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-1999696735);
                int A033 = AnonymousClass0fD.A03(433870676);
                ((Activity) this.A01).finish();
                AnonymousClass0fD.A0A(919652038, A033);
                i = 297500813;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(-2101827479);
                int A034 = AnonymousClass0fD.A03(656529472);
                Context context = (Context) this.A01;
                Intent A0A = C66580MXl.A0A(context, CustomTabMainActivity.class);
                A0A.setAction("CustomTabMainActivity.action_refresh");
                A0A.putExtra("CustomTabMainActivity.extra_url", ((C12788T6y) obj).A00);
                A0A.addFlags(603979776);
                Pxf.A0O().A0G(context, A0A);
                AnonymousClass0fD.A0A(1080329223, A034);
                i = -1542350723;
                break;
            case 3:
                A03 = AnonymousClass0fD.A03(2146786212);
                AnonymousClass3GP r9 = (AnonymousClass3GP) obj;
                int A0D = AnonymousClass7TG.A0D(r9, -1434014928);
                ((BrowserLiteInMainProcessIGActivity) this.A01).Bx5().A0A(r9.A01);
                AnonymousClass0fD.A0A(-717186273, A0D);
                i = -389832557;
                break;
            case 4:
                A03 = AnonymousClass0fD.A03(418446448);
                int A035 = AnonymousClass0fD.A03(-883704906);
                SSW A012 = ((T7S) this.A01).A01();
                Context context2 = ((C70612Sy) obj).A00;
                Q6H A04 = A012.A04();
                if (!(A04 == null || (appearanceModule = (AppearanceModule) A04.A03(AppearanceModule.class)) == null)) {
                    appearanceModule.onConfigurationChanged(context2);
                }
                AnonymousClass0fD.A0A(1160674529, A035);
                i = -1948385990;
                break;
            case 5:
                A03 = AnonymousClass0fD.A03(1133240067);
                int A036 = AnonymousClass0fD.A03(-314715424);
                T7S t7s = (T7S) this.A01;
                SSW ssw = t7s.A01;
                if (ssw != null && ssw.A0I == AnonymousClass05K.A00) {
                    t7s.A02();
                }
                AnonymousClass0fD.A0A(-1766937893, A036);
                i = -556582579;
                break;
            case 6:
                A03 = AnonymousClass0fD.A03(1331388095);
                C64649Lfb lfb = (C64649Lfb) obj;
                int A037 = AnonymousClass0fD.A03(-282627961);
                IgReactMediaPickerNativeModule igReactMediaPickerNativeModule = (IgReactMediaPickerNativeModule) this.A01;
                igReactMediaPickerNativeModule.onEventCleanup();
                if (lfb != null) {
                    String obj2 = JTQ.A09(lfb.A00).toString();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(obj2, options);
                    int i3 = options.outWidth;
                    int i4 = options.outHeight;
                    WritableNativeMap A0U = Pxe.A0U();
                    A0U.putInt(IgReactMediaPickerNativeModule.WIDTH, i3);
                    A0U.putInt(IgReactMediaPickerNativeModule.HEIGHT, i4);
                    A0U.putString("uri", obj2);
                    QZK reactApplicationContextIfActiveOrWarn = igReactMediaPickerNativeModule.getReactApplicationContextIfActiveOrWarn();
                    if (reactApplicationContextIfActiveOrWarn != null) {
                        ((RCTNativeAppEventEmitter) reactApplicationContextIfActiveOrWarn.A02(RCTNativeAppEventEmitter.class)).emit(IgReactMediaPickerNativeModule.IG_MEDIA_PICKER_PHOTO_SELECTED, A0U);
                    }
                    i2 = -2086119507;
                } else {
                    i2 = 22112552;
                }
                AnonymousClass0fD.A0A(i2, A037);
                i = 789025769;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-901235053);
                int A038 = AnonymousClass0fD.A03(370817417);
                ((MerchantShoppingCartFragment) this.A01).A0K.Dx0(((T70) obj).A00);
                AnonymousClass0fD.A0A(-572034546, A038);
                i = 1813382654;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
