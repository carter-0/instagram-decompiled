package com.facebook.cameracore.mediapipeline.services.networking.implementation.instagram;

import X.0KC;
import X.0qQ;
import X.1ES;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C11108SAj;
import X.C13207TPo;
import X.C41848B3p;
import X.C51973G9u;
import X.DbT;
import X.SCY;
import X.T0G;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.interfaces.ARNetworkClientWorkerResponse;
import com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

public final class IgNetworkClientWorkerImplHost extends Binder implements IARNetworkClientWorkerHost {
    public final Map A00 = AnonymousClass7TE.A1H();
    public final Map A01 = AnonymousClass7TE.A1H();

    public IgNetworkClientWorkerImplHost() {
        int A03 = AnonymousClass0fD.A03(468623895);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
        AnonymousClass0fD.A0A(1822167427, A03);
        int A032 = AnonymousClass0fD.A03(1421662955);
        AnonymousClass0fD.A0A(-827279893, A032);
    }

    public final void AI8(String str) {
        int i;
        int A0D = AnonymousClass7TG.A0D(str, 707579521);
        Map map = this.A01;
        if (!map.containsKey(str)) {
            0KC.A0C("IgNetworkerClientWorker", "Attempted to close shared memory for invalid request id");
            i = -898700542;
        } else {
            VersionedSharedMemory versionedSharedMemory = (VersionedSharedMemory) map.get(str);
            if (versionedSharedMemory != null) {
                versionedSharedMemory.close();
            }
            map.remove(str);
            i = -1375705992;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final Bundle Bnl() {
        int A03 = AnonymousClass0fD.A03(-1788521971);
        Bundle A0a = AnonymousClass7TE.A0a();
        Map map = this.A00;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            String A13 = DbT.A13(A1J);
            A1J.getValue();
            HttpResponse httpResponse = (HttpResponse) map.get(A13);
            if (httpResponse != null) {
                ARNetworkClientWorkerResponse aRNetworkClientWorkerResponse = new ARNetworkClientWorkerResponse();
                StatusLine statusLine = httpResponse.getStatusLine();
                aRNetworkClientWorkerResponse.A00 = statusLine.getStatusCode();
                aRNetworkClientWorkerResponse.A02 = statusLine.getReasonPhrase();
                HttpEntity entity = httpResponse.getEntity();
                aRNetworkClientWorkerResponse.A01 = entity.getContentLength();
                InputStream content = entity.getContent();
                0qQ.A07(content);
                byte[] A012 = C11108SAj.A01(content);
                int length = A012.length;
                if (length < 512000) {
                    aRNetworkClientWorkerResponse.A03 = A012;
                } else {
                    VersionedSharedMemory A013 = VersionedSharedMemory.CREATOR.A01("ig_network_worker_http_body_stream", length);
                    ByteBuffer mapReadWrite = A013.mapReadWrite();
                    if (mapReadWrite != null) {
                        mapReadWrite.position(0);
                        mapReadWrite.put(A012);
                    }
                    A0a.putParcelable("bodyStream", A013);
                    Map map2 = this.A01;
                    0qQ.A0C(A013, "null cannot be cast to non-null type com.facebook.cameracore.util.memory.VersionedSharedMemory");
                    map2.put(A13, A013);
                    A013.unmap(mapReadWrite);
                }
                A0a.putParcelable(A13, aRNetworkClientWorkerResponse);
                map.remove(A13);
            }
        }
        if (A0a.isEmpty()) {
            AnonymousClass0fD.A0A(1864415562, A03);
            return null;
        }
        AnonymousClass0fD.A0A(2135137911, A03);
        return A0a;
    }

    public final void EMa(String str, String str2, String str3, String str4, String[] strArr, String[] strArr2, boolean z) {
        int A03 = AnonymousClass0fD.A03(795893799);
        boolean A1Z = AnonymousClass7TG.A1Z(str, str2);
        String[] strArr3 = strArr;
        String[] strArr4 = strArr2;
        C51973G9u.A0r(2, str3, strArr3, strArr4);
        1ES.A06(SCY.A00(new T0G(0), str2, str3, str4, new C13207TPo(this, str), strArr3, strArr4), -4, A1Z);
        AnonymousClass0fD.A0A(-776843319, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1001589708, AnonymousClass0fD.A03(-1579093786));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-2076111018);
        boolean z = true;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
                if (i == 1) {
                    EMa(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.createStringArray(), C41848B3p.A1X(parcel));
                } else if (i == 2) {
                    Bundle Bnl = Bnl();
                    parcel2.writeNoException();
                    if (Bnl != null) {
                        parcel2.writeInt(1);
                        Bnl.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    i3 = -372717239;
                    AnonymousClass0fD.A0A(i3, A03);
                    return z;
                } else if (i == 3) {
                    AI8(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = -372717239;
                AnonymousClass0fD.A0A(i3, A03);
                return z;
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARNetworkClientWorkerHost");
                i3 = 486107238;
                AnonymousClass0fD.A0A(i3, A03);
                return z;
            }
        }
        z = super.onTransact(i, parcel, parcel2, i2);
        i3 = -2079161660;
        AnonymousClass0fD.A0A(i3, A03);
        return z;
    }
}
