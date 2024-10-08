package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public final class WTC implements MTS {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C14364Tut A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ ArrayList A03;

    public WTC(Bitmap bitmap, C14364Tut tut, String str, ArrayList arrayList) {
        this.A01 = tut;
        this.A00 = bitmap;
        this.A03 = arrayList;
        this.A02 = str;
    }

    public final void onFailure(Exception exc) {
        C14364Tut tut = this.A01;
        C310336ap r2 = new C310336ap();
        DbS.A19(tut.A01, r2, 2131964470);
        r2.A05();
        r2.A0H = "invalid_explore_grid_error";
        DbY.A1N(r2);
        this.A00.recycle();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        File file = (File) obj;
        0qQ.A0B(file, 0);
        try {
            str = file.getCanonicalPath();
        } catch (IOException unused) {
            str = file.getAbsolutePath();
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = this.A03;
        String str2 = this.A02;
        C14364Tut tut = this.A01;
        bundle.putStringArrayList("string_list", arrayList);
        bundle.putString(AnonymousClass000.A00(520), str);
        bundle.putString("explore_grid_file", str2);
        bundle.putInt("entrypoint", tut.A00);
        DbU.A0x(tut.A01, bundle, tut.A02, TransparentModalActivity.class, "explore_grid_share");
        this.A00.recycle();
    }
}
