package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.8Hf  reason: invalid class name and case insensitive filesystem */
public final class C353338Hf extends C353348Hg {
    public PickerConfiguration A00;
    public B12 A01;
    public boolean A02;
    public final AnonymousClass0iw A03;

    public final void A02(int i) {
        A08(i, !this.A02);
    }

    public final void A08(int i, boolean z) {
        if ((i != this.A00 || this.A02) && A06(i)) {
            this.A02 = !z;
            if (z) {
                this.A06.A05(10);
            }
            int i2 = this.A00;
            this.A00 = i;
            notifyItemChanged(i2);
            notifyItemChanged(this.A00);
        }
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r7, int i) {
        String str;
        PickerConfiguration.ItemConfiguration itemConfiguration;
        C380619Yw r72 = (C380619Yw) r7;
        0qQ.A0B(r72, 0);
        PickerConfiguration pickerConfiguration = this.A00;
        if (pickerConfiguration == null) {
            str = "Should not be able to bind picker configuration without a picker configuration";
        } else {
            PickerConfiguration.ItemConfiguration[] itemConfigurationArr = pickerConfiguration.mItems;
            if (itemConfigurationArr == null || (itemConfiguration = itemConfigurationArr[i]) == null) {
                str = "Item configurations should never be null";
            } else {
                A07(r72, i);
                String str2 = itemConfiguration.mImageUri;
                int i2 = 0;
                if (str2 != null) {
                    r72.A0A.A0D(this.A03, (0lg) null, new SimpleImageUrl(str2), false);
                    return;
                }
                byte[] bArr = itemConfiguration.mImageData;
                if (bArr != null) {
                    AnonymousClass8DV r1 = new AnonymousClass8DV(this.A01.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                    r1.A00();
                    r72.A0A.setImageDrawable(r1);
                }
                View view = r72.A08;
                if (i != this.A00 || !this.A02) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                return;
            }
        }
        0kD.A07("GenericEffectPickerAdapter", str, (Throwable) null);
    }

    public C353338Hf(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass8AM r4) {
        super(context, userSession, r4);
        this.A03 = r2;
    }

    public final int getItemCount() {
        int i;
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr;
        int A032 = AnonymousClass0fD.A03(1402225690);
        PickerConfiguration pickerConfiguration = this.A00;
        if (pickerConfiguration == null || (itemConfigurationArr = pickerConfiguration.mItems) == null) {
            i = 0;
        } else {
            i = itemConfigurationArr.length;
        }
        AnonymousClass0fD.A0A(-831656247, A032);
        return i;
    }
}
