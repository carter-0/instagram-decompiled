package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudienceGeoLocation;

public final class U9m extends 2Rw {
    public final int A00;
    public final Object A01;

    public U9m(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final int getItemCount() {
        int A03;
        int length;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1965338881);
                length = ((U92) ((UZ7) this.A01).A0B.getValue()).A0A().A05.size();
                i = 261337360;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-673458996);
                length = ((VWZ) this.A01).A02.length;
                i = 1507272717;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(778428840);
                length = ((VWX) this.A01).A02.length;
                i = -1925710679;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1278023830);
                VWY vwy = (VWY) this.A01;
                length = vwy.A02[0].length * vwy.A01.length;
                i = 1890511346;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
        return length;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        TextView textView;
        int i2;
        C17447VWa vWa;
        switch (this.A00) {
            case 0:
                UBT ubt = (UBT) r6;
                0qQ.A0B(ubt, 0);
                AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) ((U92) ((UZ7) this.A01).A0B.getValue()).A0A().A05.get(i);
                0qQ.A0B(audienceGeoLocation, 0);
                ubt.A00.setText(audienceGeoLocation.A05);
                WBH.A01(ubt.itemView, 59, audienceGeoLocation, ubt);
                return;
            case 1:
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UCI) r6).A00;
                VWZ vwz = (VWZ) this.A01;
                textView.setText(vwz.A02[i]);
                C17447VWa[] vWaArr = vwz.A01;
                textView.setMaxLines(vWaArr[i].A01);
                textView.getPaint().setFakeBoldText(true);
                i2 = vwz.A00;
                vWa = vWaArr[i];
                break;
            case 2:
                int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UCI) r6).A00;
                VWX vwx = (VWX) this.A01;
                textView.setText(vwx.A02[i]);
                textView.getPaint().setFakeBoldText(true);
                vWa = vwx.A01;
                textView.setMaxLines(vWa.A01);
                i2 = vwx.A00;
                break;
            default:
                VWY vwy = (VWY) this.A01;
                String[][] strArr = vwy.A02;
                int length = strArr[0].length;
                int i5 = i / length;
                int i6 = i % length;
                int i7 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UCI) r6).A00;
                textView.setText(strArr[i5][i6]);
                C17447VWa[] vWaArr2 = vwy.A01;
                textView.setMaxLines(vWaArr2[i5].A01);
                i2 = vwy.A00;
                vWa = vWaArr2[i5];
                break;
        }
        0nA.A0g(textView, i2, vWa.A00);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.3kE, X.UBT] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.A00 != 0) {
            return new UCI((TextView) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.size_chart_cell_item));
        }
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.promote_create_audience_selected_location, false);
        X3P x3p = ((UZ7) this.A01).A06;
        AnonymousClass7TG.A1O(A09, x3p);
        ? r2 = new C249703kE(A09);
        r2.A01 = x3p;
        r2.A00 = AnonymousClass7TG.A0R(A09, R.id.selected_location_name);
        return r2;
    }
}
