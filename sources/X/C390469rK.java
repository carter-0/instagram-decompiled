package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: X.9rK  reason: invalid class name and case insensitive filesystem */
public final class C390469rK extends C15291UZw {
    public static final String __redex_internal_original_name = "MagicMediaRemixCameraFragment";
    public Context A00;
    public int A01;
    public int A02;
    public Medium A03;
    public DirectThreadKey A04;
    public String A05 = "";
    public String A06 = "";

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A00;
        String str = "context";
        if (context != null) {
            float A09 = (float) 0nA.A09(context);
            Context context2 = this.A00;
            if (context2 != null) {
                float A08 = (float) 0nA.A08(context2);
                RectF A0C = AnonymousClass7TF.A0C(A09, A08);
                RectF rectF = new RectF(0.0f, 0.0f, A09, A08);
                AnonymousClass80D A002 = AnonymousClass80D.A00();
                AnonymousClass80D.A0C(A002, this.A03, this);
                AnonymousClass80I r4 = AnonymousClass80H.A02;
                UserSession userSession = this.A00;
                0qQ.A06(userSession);
                AnonymousClass80D.A08(userSession, r4, AnonymousClass80M.A00, A002);
                AnonymousClass80D.A05(viewGroup, A002, this, true);
                A002.A0B = 28D.A2I;
                A002.A0O = this;
                A002.A1J = this.A04;
                AnonymousClass80D.A02(A0C, rectF, A002);
                A002.A3y = true;
                Medium medium = this.A03;
                if (medium == null) {
                    str = "medium";
                } else {
                    A002.A0P = medium;
                    A002.A0w = null;
                    A002.A3Q = true;
                    A002.A3s = true;
                    A002.A28 = AnonymousClass05K.A02;
                    A002.A27 = Integer.valueOf(this.A01);
                    A002.A2X = this.A05;
                    A002.A2W = this.A06;
                    A002.A02 = this.A02;
                    return A002;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "magic_media_remix_camera_fragment";
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(491100166);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = requireContext();
        this.A01 = requireArguments.getInt(AnonymousClass000.A00(2364));
        Parcelable.Creator creator = DirectThreadKey.CREATOR;
        0qQ.A08(creator);
        this.A04 = (DirectThreadKey) 0B0.A01(creator, requireArguments.getParcelable(AnonymousClass000.A00(2363)), DirectThreadKey.class);
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        new Canvas(createBitmap);
        Context context = this.A00;
        if (context == null) {
            0qQ.A0F("context");
            throw AnonymousClass00P.createAndThrow();
        }
        File file = new File(context.getCacheDir(), 002.A03(createBitmap.hashCode(), ".png"));
        file.createNewFile();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        0fO.A02(Bitmap.CompressFormat.PNG, createBitmap, byteArrayOutputStream, 0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArray);
        fileOutputStream.flush();
        fileOutputStream.close();
        0qQ.A0B(file, 0);
        this.A03 = C282665Eg.A03(file, 1, 0);
        this.A05 = requireArguments.getString(AnonymousClass000.A00(2365), "");
        this.A06 = requireArguments.getString(AnonymousClass000.A00(2367), "");
        this.A02 = requireArguments.getInt(AnonymousClass000.A00(2366));
        AnonymousClass0fD.A09(-2095379476, A022);
    }
}
