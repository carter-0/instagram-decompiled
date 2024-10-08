package com.facebook.pando;

import X.002;
import X.0KC;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66581MXm;
import X.C9153RRe;
import X.Pxe;
import X.RW7;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class TreeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(40);
    public final TreeJNI A00;

    public static TreeJNI A00(Parcel parcel) {
        String readString;
        GZIPInputStream gZIPInputStream;
        if (parcel == null || (readString = parcel.readString()) == null) {
            return null;
        }
        Class<?> cls = Class.forName(readString);
        if (TreeJNI.class.isAssignableFrom(cls)) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            ByteArrayOutputStream A0b = Pxe.A0b();
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2);
                        if (read == -1) {
                            break;
                        }
                        A0b.write(bArr2, 0, read);
                    }
                    ByteBuffer wrap = ByteBuffer.wrap(A0b.toByteArray());
                    RW7 rw7 = TreeSerializer.Companion;
                    AnonymousClass7TG.A1N(wrap, cls);
                    if (!wrap.isDirect()) {
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(wrap.capacity());
                        0qQ.A07(allocateDirect);
                        if (allocateDirect.isDirect()) {
                            allocateDirect.put(wrap.duplicate());
                            allocateDirect.position(0);
                            wrap = allocateDirect;
                        } else {
                            throw AnonymousClass7TE.A1B("Direct ByteBuffer is not supported on this platform");
                        }
                    }
                    TreeJNI deserializeFromBytesNative = TreeSerializer.deserializeFromBytesNative(wrap, cls);
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    A0b.close();
                    return deserializeFromBytesNative;
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    A0b.close();
                    throw th2;
                } catch (Throwable th3) {
                    C9153RRe.A00(th2, th3);
                    throw th2;
                }
            }
        } else {
            throw AnonymousClass7TE.A0w(002.A0u("Parcel does not contain valid Pando tree.", readString, " ", cls.getSimpleName()));
        }
        throw th;
    }

    public final int describeContents() {
        return 0;
    }

    public static void A01(Parcel parcel, TreeJNI treeJNI) {
        GZIPOutputStream gZIPOutputStream;
        if (treeJNI != null) {
            parcel.writeString(C66581MXm.A0y(treeJNI));
            try {
                ByteBuffer serializeAsBytes = TreeSerializer.serializeAsBytes(treeJNI);
                byte[] bArr = new byte[serializeAsBytes.limit()];
                serializeAsBytes.get(bArr);
                ByteArrayOutputStream A0b = Pxe.A0b();
                try {
                    gZIPOutputStream = new GZIPOutputStream(A0b);
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.close();
                    byte[] byteArray = A0b.toByteArray();
                    A0b.close();
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                    return;
                } catch (Throwable th) {
                    A0b.close();
                    throw th;
                }
            } catch (IOException e) {
                throw e;
            } catch (Throwable th2) {
                C9153RRe.A00(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            A01(parcel, this.A00);
        } catch (Exception e) {
            0KC.A0Q("TreeParcelable::writeToParcel", "Failed to write Pando tree to parcel: %s", new Object[]{e.toString()});
        }
    }

    public TreeParcelable(TreeJNI treeJNI) {
        this.A00 = treeJNI;
    }
}
