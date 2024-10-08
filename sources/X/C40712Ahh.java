package X;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.cameracore.mediapipeline.services.uicontrol.SliderConfiguration;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ahh  reason: case insensitive filesystem */
public final class C40712Ahh implements B38 {
    public C371638yj A00;
    public final B11 A01 = new ASD(this);
    public final B12 A02 = new ASF(this);
    public final C41812B1r A03 = new ASH(this);
    public final List A04 = AnonymousClass7TE.A1C();

    public final void FKT(Bundle bundle) {
        String string;
        C371638yj r1;
        Handler handler;
        Runnable aoX;
        C371638yj r5;
        Object parcelable;
        String str;
        ByteBuffer byteBuffer;
        PickerConfiguration pickerConfiguration;
        byte[] bArr;
        C371638yj r2;
        Bundle bundle2 = bundle;
        0qQ.A0B(bundle2, 0);
        if (this.A00 != null) {
            bundle2.setClassLoader(VersionedSharedMemory.CREATOR.getClass().getClassLoader());
            if (bundle2.containsKey("commandType")) {
                int i = bundle2.getInt("commandType");
                if (i == 0) {
                    if (bundle2.containsKey("sizes") && bundle2.containsKey("imageUris") && bundle2.containsKey("titles") && bundle2.containsKey("ids") && bundle2.containsKey("selectedIndex") && bundle2.containsKey("imagesData")) {
                        ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("sizes");
                        int i2 = bundle2.getInt("selectedIndex");
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("imageUris");
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("titles");
                        ArrayList<String> stringArrayList3 = bundle2.getStringArrayList("ids");
                        if (Build.VERSION.SDK_INT >= 33) {
                            parcelable = bundle2.getParcelable("imagesData", VersionedSharedMemory.TAG);
                        } else {
                            parcelable = bundle2.getParcelable("imagesData");
                        }
                        VersionedSharedMemory versionedSharedMemory = (VersionedSharedMemory) parcelable;
                        if (!(integerArrayList == null || stringArrayList == null || stringArrayList2 == null || stringArrayList3 == null)) {
                            ArrayList A1C = AnonymousClass7TE.A1C();
                            if (versionedSharedMemory != null) {
                                Iterator<Integer> it = integerArrayList.iterator();
                                int i3 = 0;
                                while (it.hasNext()) {
                                    i3 += AnonymousClass7TG.A0A(it.next());
                                }
                                if (i3 != versionedSharedMemory.size) {
                                    str = "Invalid Picker Configuration due to mismatched image data sizes";
                                    0KC.A0C("AREngineNativeUIControl", str);
                                    pickerConfiguration = new PickerConfiguration(-1, (PickerConfiguration.ItemConfiguration[]) A1C.toArray(new PickerConfiguration.ItemConfiguration[0]));
                                    int i4 = pickerConfiguration.mSelectedIndex;
                                    if (i4 >= 0 && i4 < stringArrayList3.size() && (r2 = this.A00) != null) {
                                        r2.A00.post(new C40948Alu(pickerConfiguration, r2));
                                    }
                                }
                            }
                            int size = stringArrayList3.size();
                            if (size != stringArrayList.size() || size != stringArrayList2.size() || size != integerArrayList.size()) {
                                str = "Invalid Picker Configuration due to mismatched picker item sizes";
                                0KC.A0C("AREngineNativeUIControl", str);
                                pickerConfiguration = new PickerConfiguration(-1, (PickerConfiguration.ItemConfiguration[]) A1C.toArray(new PickerConfiguration.ItemConfiguration[0]));
                                int i42 = pickerConfiguration.mSelectedIndex;
                                r2.A00.post(new C40948Alu(pickerConfiguration, r2));
                            } else if (i2 >= 0 || i2 < size) {
                                if (versionedSharedMemory != null) {
                                    byteBuffer = versionedSharedMemory.mapReadOnly();
                                } else {
                                    byteBuffer = null;
                                }
                                Iterator<String> it2 = stringArrayList3.iterator();
                                int i5 = 0;
                                while (it2.hasNext()) {
                                    String next = it2.next();
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        0sr.A1T();
                                        throw AnonymousClass00P.createAndThrow();
                                    }
                                    String str2 = next;
                                    Number number = integerArrayList.get(i5);
                                    if (byteBuffer != null) {
                                        bArr = new byte[AnonymousClass7TG.A0A(number)];
                                        byteBuffer.get(bArr, 0, AnonymousClass7TG.A0A(number));
                                    } else {
                                        bArr = null;
                                    }
                                    A1C.add(new PickerConfiguration.ItemConfiguration(stringArrayList.get(i5), bArr, stringArrayList2.get(i5), str2));
                                    i5 = i6;
                                }
                                if (versionedSharedMemory != null) {
                                    versionedSharedMemory.unmap(byteBuffer);
                                    versionedSharedMemory.close();
                                }
                                pickerConfiguration = new PickerConfiguration(i2, (PickerConfiguration.ItemConfiguration[]) A1C.toArray(new PickerConfiguration.ItemConfiguration[0]));
                                int i422 = pickerConfiguration.mSelectedIndex;
                                r2.A00.post(new C40948Alu(pickerConfiguration, r2));
                            } else {
                                str = "Invalid Picker Configuration due to out of bounds selected index";
                                0KC.A0C("AREngineNativeUIControl", str);
                                pickerConfiguration = new PickerConfiguration(-1, (PickerConfiguration.ItemConfiguration[]) A1C.toArray(new PickerConfiguration.ItemConfiguration[0]));
                                int i4222 = pickerConfiguration.mSelectedIndex;
                                r2.A00.post(new C40948Alu(pickerConfiguration, r2));
                            }
                        }
                    }
                    this.A04.add(AnonymousClass7TG.A0P("commandType", AnonymousClass05K.A08, AnonymousClass7TH.A0I()));
                    return;
                }
                if (i == 2) {
                    C371638yj r0 = this.A00;
                    if (r0 != null) {
                        handler = r0.A00;
                        aoX = new C364668ln(r0);
                    } else {
                        return;
                    }
                } else if (i == 3) {
                    if (bundle2.containsKey("index")) {
                        int i7 = bundle2.getInt("index");
                        C371638yj r02 = this.A00;
                        if (r02 != null) {
                            handler = r02.A00;
                            aoX = new C40944Alq(r02, i7);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 4) {
                    if (bundle2.containsKey("steps") && bundle2.containsKey("sliderType") && bundle2.containsKey("colorSamplerRGBAData") && bundle2.containsKey("imageData")) {
                        int i8 = bundle2.getInt("steps");
                        int i9 = bundle2.getInt("sliderType");
                        float[] floatArray = bundle2.getFloatArray("colorSamplerRGBAData");
                        C371638yj r22 = this.A00;
                        if (r22 != null) {
                            SliderConfiguration sliderConfiguration = new SliderConfiguration(i8, i9, floatArray, (byte[]) null);
                            handler = r22.A00;
                            aoX = new C371658yn(sliderConfiguration, r22);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 6) {
                    C371638yj r03 = this.A00;
                    if (r03 != null) {
                        handler = r03.A00;
                        aoX = new C368468sf(r03);
                    } else {
                        return;
                    }
                } else if (i == 7) {
                    if (bundle2.containsKey("adjustmentValue")) {
                        float f = bundle2.getFloat("adjustmentValue");
                        C371638yj r04 = this.A00;
                        if (r04 != null) {
                            handler = r04.A00;
                            aoX = new C40946Als(r04, f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 10) {
                    C371638yj r05 = this.A00;
                    if (r05 != null) {
                        handler = r05.A00;
                        aoX = new C40732AiJ(r05);
                    } else {
                        return;
                    }
                } else if (i == 5) {
                    C371638yj r12 = this.A00;
                    if (r12 != null) {
                        B11 b11 = this.A01;
                        handler = r12.A00;
                        aoX = new C40945Alr(r12, b11);
                    } else {
                        return;
                    }
                } else if (i == 1) {
                    C371638yj r13 = this.A00;
                    if (r13 != null) {
                        B12 b12 = this.A02;
                        handler = r13.A00;
                        aoX = new C40947Alt(r13, b12);
                    } else {
                        return;
                    }
                } else if (i == 8) {
                    if (bundle2.containsKey("text") && bundle2.containsKey("userEdited") && bundle2.containsKey("inputTypeHint") && bundle2.containsKey("cursorStartIndex")) {
                        String string2 = bundle2.getString("text");
                        boolean z = bundle2.getBoolean("userEdited");
                        int i10 = bundle2.getInt("inputTypeHint");
                        int i11 = bundle2.getInt("cursorStartIndex");
                        if (string2 != null && (r5 = this.A00) != null) {
                            handler = r5.A00;
                            aoX = new C41243Aqf(r5, (C371648yk) null, string2, i10, i11, z);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 9 && bundle2.containsKey("text") && (string = bundle2.getString("text")) != null && (r1 = this.A00) != null) {
                    C41812B1r b1r = this.A03;
                    handler = r1.A00;
                    aoX = new C41111AoX(r1, b1r, string);
                } else {
                    return;
                }
                handler.post(aoX);
            }
        }
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(58);
    }

    public final void CMw(C371698yt r3) {
        C371638yj r0;
        if (r3 != null) {
            C371628yi r1 = C371608yg.A02;
            if (C371698yt.A01(r3, r1)) {
                C371608yg r02 = (C371608yg) r3.A02(r1);
                if (r02 != null) {
                    r0 = r02.A00;
                } else {
                    r0 = null;
                }
                this.A00 = r0;
            }
        }
    }

    public final List EzR() {
        List list = this.A04;
        ArrayList A0U = 00k.A0U(list);
        if (A0U.isEmpty()) {
            A0U.add(AnonymousClass7TH.A05(58));
        }
        list.clear();
        return A0U;
    }
}
