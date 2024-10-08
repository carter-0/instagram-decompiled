package X;

import android.graphics.drawable.Drawable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.List;

/* renamed from: X.8YE  reason: invalid class name */
public final class AnonymousClass8YE {
    public int A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Drawable A0C;
    public final CameraAREffect A0D;
    public final AnonymousClass87I A0E;
    public final ProductItemWithAR A0F;
    public final AnonymousClass8YF A0G;
    public final String A0H;
    public final String A0I;

    public AnonymousClass8YE(Drawable drawable, CameraAREffect cameraAREffect, AnonymousClass87I r6, ImageUrl imageUrl, ProductItemWithAR productItemWithAR, AnonymousClass8YF r9, String str, String str2) {
        String str3;
        String str4;
        this.A04 = null;
        this.A03 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A0E = r6;
        this.A0I = str == null ? "" : str;
        this.A02 = imageUrl;
        this.A0C = drawable;
        this.A0F = productItemWithAR;
        this.A0G = r9;
        this.A0H = str2;
        if (r6 != AnonymousClass87I.AR_EFFECT && r6 != AnonymousClass87I.AVATAR_EFFECT && r6 != AnonymousClass87I.AVATAR_PRESET) {
            this.A0D = null;
            if (cameraAREffect != null) {
                AnonymousClass87G r0 = AnonymousClass87G.A0T;
                str3 = "DialElement";
                StringBuilder sb = new StringBuilder();
                sb.append("Builder() ");
                sb.append(r6);
                sb.append(" has mCameraArEffect=");
                sb.append(cameraAREffect);
                str4 = sb.toString();
            } else {
                return;
            }
        } else if (cameraAREffect != null) {
            this.A0D = cameraAREffect;
            return;
        } else {
            this.A0D = null;
            AnonymousClass87G r02 = AnonymousClass87G.A0T;
            str3 = "DialElement";
            str4 = "Builder() found null mCameraArEffect";
        }
        0wb.A03(str3, str4);
    }

    public AnonymousClass8YE(Drawable drawable, AnonymousClass87I r11, String str) {
        this(drawable, (CameraAREffect) null, r11, (ImageUrl) null, (ProductItemWithAR) null, (AnonymousClass8YF) null, str, (String) null);
    }
}
