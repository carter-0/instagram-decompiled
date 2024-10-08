package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public abstract class A02 {
    public static final C39781A9a A00(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.disabled_composer_text, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new C39781A9a((ViewGroup) inflate);
    }
}
