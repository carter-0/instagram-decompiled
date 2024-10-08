package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class AS7 implements C312366eJ {
    public final /* synthetic */ AhY A00;

    public final void DX9(PickerConfiguration pickerConfiguration, String str) {
        int i;
        PickerConfiguration pickerConfiguration2 = pickerConfiguration;
        0qQ.A0B(pickerConfiguration2, 1);
        PickerConfiguration.ItemConfiguration[] itemConfigurationArr = pickerConfiguration2.mItems;
        0qQ.A07(itemConfigurationArr);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        for (PickerConfiguration.ItemConfiguration itemConfiguration : itemConfigurationArr) {
            A1C.add(itemConfiguration.mImageUri);
            A1C2.add(itemConfiguration.mTitle);
            A1C3.add(itemConfiguration.mId);
            byte[] bArr = itemConfiguration.mImageData;
            if (bArr != null) {
                i = bArr.length;
            } else {
                i = 0;
            }
            AnonymousClass7TF.A1M(A1C4, i);
        }
        Bundle A002 = Q21.A00(AnonymousClass7TH.A0I(), AnonymousClass7TH.A0J(AnonymousClass05K.A00), AnonymousClass7TE.A1L("selectedIndex", Integer.valueOf(pickerConfiguration2.mSelectedIndex)), AnonymousClass7TE.A1L("imageUris", A1C), AnonymousClass7TE.A1L("titles", A1C2), AnonymousClass7TE.A1L("ids", A1C3), AnonymousClass7TE.A1L("sizes", A1C4));
        if (00k.A02(A1C4) > 0) {
            AhY ahY = this.A00;
            VersionedSharedMemory A01 = VersionedSharedMemory.CREATOR.A01("ui_control_picker_image_data", 00k.A02(A1C4));
            ahY.A04 = A01;
            ByteBuffer mapReadWrite = A01.mapReadWrite();
            if (mapReadWrite != null) {
                mapReadWrite.position(0);
            }
            for (PickerConfiguration.ItemConfiguration itemConfiguration2 : itemConfigurationArr) {
                if (mapReadWrite != null) {
                    mapReadWrite.put(itemConfiguration2.mImageData);
                }
            }
            VersionedSharedMemory versionedSharedMemory = ahY.A04;
            if (versionedSharedMemory != null) {
                versionedSharedMemory.unmap(mapReadWrite);
            }
            A002.putParcelable("imagesData", ahY.A04);
        }
        this.A00.A09.add(A002);
    }

    public final void DXC(B12 b12, String str) {
        0qQ.A0B(b12, 1);
        AhY ahY = this.A00;
        ahY.A02 = b12;
        AnonymousClass7TH.A0d(AnonymousClass05K.A01, ahY.A09, AnonymousClass7TH.A0I());
    }

    public AS7(AhY ahY) {
        this.A00 = ahY;
    }

    public final void DXA() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A0C, this.A00.A09, AnonymousClass7TH.A0I());
    }

    public final void DXB(String str, int i) {
        AnonymousClass7TH.A0c("index", Integer.valueOf(i), this.A00.A09, AnonymousClass7TH.A0I(), AnonymousClass7TH.A0J(AnonymousClass05K.A0N));
    }
}
