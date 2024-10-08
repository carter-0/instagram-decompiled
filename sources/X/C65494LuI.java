package X;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.LuI  reason: case insensitive filesystem */
public final class C65494LuI implements C66496MTz {
    public final int A00;
    public final Object A01;

    public C65494LuI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DAG(MusicAssetModel musicAssetModel) {
        int i = this.A00;
        0qQ.A0B(musicAssetModel, 0);
        if (i != 0) {
            SpannableStringBuilder A0E = C51965G9l.A0E();
            A0E.append(musicAssetModel.A0I);
            A0E.append(" • ");
            A0E.append(musicAssetModel.A0D);
            TextView textView = ((K5C) this.A01).A00;
            if (textView == null) {
                0qQ.A0F("audioAttributionText");
                throw AnonymousClass00P.createAndThrow();
            } else {
                textView.setText(A0E);
            }
        } else {
            C63924LDf lDf = (C63924LDf) this.A01;
            lDf.A03.A00(musicAssetModel);
            lDf.A00();
        }
    }

    public final void DAH() {
        if (this.A00 != 0) {
            0wb.A03(K5C.__redex_internal_original_name, "Unable to download music asset model for clip preview.");
        } else {
            ((C63924LDf) this.A01).A02.DSo("download music asset failed");
        }
    }
}
