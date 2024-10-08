package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.mediapicker.Folder;

/* renamed from: X.JeJ  reason: case insensitive filesystem */
public final class C60051JeJ extends BaseAdapter {
    public int A00 = R.layout.gallery_grid_folder_picker_item;
    public int A01 = R.layout.gallery_grid_folder_picker_title;
    public TextView A02;
    public final C361528gN A03;

    public C60051JeJ(C361528gN r2) {
        0qQ.A0B(r2, 1);
        this.A03 = r2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        boolean z = false;
        if (view == null) {
            view = DbV.A0D(viewGroup).inflate(this.A00, viewGroup, false);
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) view;
        Object item = getItem(i);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.Folder");
        Folder folder = (Folder) item;
        textView.setText(folder.A03);
        if (this.A03.getCurrentFolder() == folder) {
            z = true;
        }
        textView.setActivated(z);
        return textView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0C(DbV.A0D(viewGroup), viewGroup, this.A01);
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        this.A02 = (TextView) view;
        Object item = getItem(i);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.Folder");
        Folder folder = (Folder) item;
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(folder.A03);
        }
        return this.A02;
    }

    public final int getCount() {
        return this.A03.getFolders().size();
    }

    public final Object getItem(int i) {
        return this.A03.getFolders().get(i);
    }

    public final long getItemId(int i) {
        return (long) ((Folder) this.A03.getFolders().get(i)).A02;
    }
}
