package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.graphservice.interfaces.Tree;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.SSc  reason: case insensitive filesystem */
public final class C11405SSc {
    public static Parcelable A00(Object obj) {
        GZIPOutputStream gZIPOutputStream;
        if (obj instanceof Tree) {
            Tree tree = (Tree) obj;
            if (tree.isValidGraphServicesJNIModel()) {
                String A0y = C66581MXm.A0y(tree);
                int typeTag = tree.getTypeTag();
                try {
                    ByteBuffer serializeTreeToByteBuffer = SN1.A00().serializeTreeToByteBuffer(tree);
                    byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
                    serializeTreeToByteBuffer.get(bArr);
                    ByteArrayOutputStream A0b = Pxe.A0b();
                    try {
                        gZIPOutputStream = new GZIPOutputStream(A0b);
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.close();
                        byte[] byteArray = A0b.toByteArray();
                        A0b.close();
                        TreeParcelable treeParcelable = new TreeParcelable(byteArray, typeTag, A0y);
                        treeParcelable.A00 = tree;
                        return treeParcelable;
                    } catch (Throwable th) {
                        A0b.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    throw AnonymousClass7TE.A0w("Exception during serialization of TreeModel");
                } catch (Throwable th2) {
                    C9153RRe.A00(th, th2);
                }
            } else {
                throw AnonymousClass7TE.A11("asTree_DO_NOT_USE");
            }
        } else {
            0KC.A0E("ModelParcelHelper", "Non-Tree type model conversion to Parcelable");
            return new ModelParcelHelper$LazyHolder(obj);
        }
        throw th;
    }

    public static Object A01(Parcelable parcelable) {
        Object obj;
        IllegalArgumentException th;
        GZIPInputStream gZIPInputStream;
        if (parcelable instanceof TreeParcelable) {
            try {
                TreeParcelable treeParcelable = (TreeParcelable) parcelable;
                obj = treeParcelable.A00;
                if (obj == null) {
                    String str = treeParcelable.A02;
                    Class<?> cls = Class.forName(str);
                    if (Tree.class.isAssignableFrom(cls)) {
                        ByteArrayOutputStream A0b = Pxe.A0b();
                        try {
                            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(treeParcelable.A03);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 1024);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = gZIPInputStream.read(bArr);
                                    if (read != -1) {
                                        A0b.write(bArr, 0, read);
                                    } else {
                                        Tree deserializeTreeFromByteBuffer = SN1.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(A0b.toByteArray()), cls, treeParcelable.A01);
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        A0b.close();
                                        treeParcelable.A00 = deserializeTreeFromByteBuffer;
                                        return deserializeTreeFromByteBuffer;
                                    }
                                }
                            } catch (Throwable th2) {
                                byteArrayInputStream.close();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                A0b.close();
                            } catch (Throwable th4) {
                                C9153RRe.A00(th, th4);
                            }
                        }
                    } else {
                        th = AnonymousClass7TE.A0w(002.A0u("Parcel does not contain valid GraphQL Tree ", str, " ", cls.getSimpleName()));
                        throw th;
                    }
                }
            } catch (Exception e) {
                throw AnonymousClass7TF.A0W("Exception deserializing GraphQL model from Parcel: ", e.getMessage());
            }
        } else if (parcelable instanceof ModelParcelHelper$LazyHolder) {
            0KC.A0E("ModelParcelHelper", "Parcelable deprecated flatbuffer model");
            Class<Object> cls2 = Object.class;
            obj = ((ModelParcelHelper$LazyHolder) parcelable).A00;
            if (obj != null) {
                Class<?> cls3 = obj.getClass();
                if (!cls2.isAssignableFrom(cls3)) {
                    throw AnonymousClass7TE.A0w(002.A0u("Type mismatch. Expected ", cls2.getName(), AnonymousClass000.A00(844), cls3.getName()));
                }
            }
        } else {
            throw AnonymousClass7TE.A0z("Unknown GraphQL model type in Parcel");
        }
        return obj;
        throw th;
    }

    public static ArrayList A02(Bundle bundle) {
        ArrayList parcelableArrayList;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("financial_entities")) == null) {
            return null;
        }
        ArrayList A14 = Pxg.A14(parcelableArrayList);
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            if (parcelable != null) {
                A14.add(A01(parcelable));
            } else {
                A14.add((Object) null);
            }
        }
        return A14;
    }

    public static void A03(Bundle bundle, C250673ls r2, String str) {
        Parcelable A00;
        if (r2 == null) {
            A00 = null;
        } else {
            A00 = A00(r2);
        }
        bundle.putParcelable(str, A00);
    }

    public static void A04(List list, Bundle bundle) {
        ArrayList A0m = C51970G9q.A0m(list);
        for (Object next : list) {
            if (next != null) {
                A0m.add(A00(next));
            } else {
                A0m.add((Object) null);
            }
        }
        bundle.putParcelableArrayList("financial_entities", A0m);
    }
}
