package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.instagram.android.R;

public final class JWA extends BaseAdapter {
    public final Resources A00;
    public final MXO A01;

    public JWA(Resources resources, MXO mxo) {
        0qQ.A0B(resources, 2);
        this.A01 = mxo;
        this.A00 = resources;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        0qQ.A0B(this.A00, 2);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spinner_menu_title, viewGroup, false);
            0qQ.A0C(view, "null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) view;
        Object item = getItem(i);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MixedFolder");
        textView.setText(((C357268Xf) item).getName());
        return textView;
    }

    public final int getCount() {
        return this.A01.getCombinedFolders().size();
    }

    public final Object getItem(int i) {
        return this.A01.getCombinedFolders().get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1.BEU() != r5.BEU()) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getDropDownView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
            r6 = this;
            X.AnonymousClass7TG.A1O(r8, r9)
            android.widget.TextView r8 = (android.widget.TextView) r8
            java.lang.Object r5 = r6.getItem(r7)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.mediapicker.MixedFolder"
            X.0qQ.A0C(r5, r0)
            X.8Xf r5 = (X.C357268Xf) r5
            X.MXO r4 = r6.A01
            X.8Xf r1 = r4.getCurrentMixedFolder()
            java.lang.String r0 = r5.getName()
            r8.setText(r0)
            java.lang.Integer r0 = r1.CAp()
            java.lang.Integer r3 = r5.CAp()
            if (r0 != r3) goto L_0x0032
            int r2 = r1.BEU()
            int r1 = r5.BEU()
            r0 = 1
            if (r2 == r1) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r8.setActivated(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x0044
            com.instagram.ui.widget.mediapicker.Folder r5 = (com.instagram.ui.widget.mediapicker.Folder) r5
            X.LYd r0 = new X.LYd
            r0.<init>(r4, r5)
            r8.setOnTouchListener(r0)
        L_0x0044:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWA.getDropDownView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
