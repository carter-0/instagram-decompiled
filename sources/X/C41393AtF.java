package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.AtF  reason: case insensitive filesystem */
public final /* synthetic */ class C41393AtF implements AnonymousClass0eK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass8AL A01;
    public final /* synthetic */ AYL A02;

    public /* synthetic */ C41393AtF(View view, AnonymousClass8AL r2, AYL ayl) {
        this.A02 = ayl;
        this.A00 = view;
        this.A01 = r2;
    }

    public final Object get() {
        AYL ayl = this.A02;
        View view = this.A00;
        AnonymousClass8AL r9 = this.A01;
        Context context = view.getContext();
        View view2 = ayl.A0L;
        return new C360778f8(context, view2.requireViewById(R.id.direct_camera_text_format_button), (EditText) view2.requireViewById(R.id.text_overlay_edit_text), (RecyclerView) view2.requireViewById(R.id.text_tool_format_picker_recycler_view), ayl.A0Q, ayl.A0R, r9, new C40415Abm(ayl), (C358868bb) null, false, true);
    }
}
