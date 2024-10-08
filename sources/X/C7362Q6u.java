package X;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.io.FileDescriptor;

/* renamed from: X.Q6u  reason: case insensitive filesystem */
public final class C7362Q6u extends Binder {
    public static boolean A03;
    public final Context A00;
    public final IBinder A01;
    public final C62320sa A02;

    public final void dump(FileDescriptor fileDescriptor, String[] strArr) {
        0qQ.A0B(fileDescriptor, 0);
        this.A01.dump(fileDescriptor, strArr);
    }

    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) {
        0qQ.A0B(fileDescriptor, 0);
        this.A01.dumpAsync(fileDescriptor, strArr);
    }

    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        0qQ.A0B(deathRecipient, 0);
        this.A01.linkToDeath(deathRecipient, i);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        0qQ.A0B(parcel, 1);
        try {
            throw new SecurityException(002.A0g("Attempted to look up interface descriptor: ", this.A01.getInterfaceDescriptor(), " in the STUB file for GlobalSecureAIDLTrustedCallerMap, which is completely empty. This file being included usually indicates an issue with global Metagen setup. @SecureAIDL and related functionality will not work without global Metagen - please check that it is being enabled correctly."));
        } catch (C7885QcA unused) {
            this.A02.invoke();
            return this.A01.transact(i, parcel, parcel2, i2);
        } catch (C7886QcB e) {
            if (!A03) {
                0KC.A0H("IdentityCheckingBinder", "StubGlobalMapException was thrown. Falling back to using default identity check in IdentityCheckingBinder.", e);
                A03 = true;
            }
            this.A02.invoke();
            return this.A01.transact(i, parcel, parcel2, i2);
        }
    }

    public final IInterface queryLocalInterface(String str) {
        0qQ.A0B(str, 0);
        return this.A01.queryLocalInterface(str);
    }

    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        0qQ.A0B(deathRecipient, 0);
        return this.A01.unlinkToDeath(deathRecipient, i);
    }

    public final String getInterfaceDescriptor() {
        return this.A01.getInterfaceDescriptor();
    }

    public final boolean isBinderAlive() {
        return this.A01.isBinderAlive();
    }

    public final boolean pingBinder() {
        return this.A01.pingBinder();
    }

    public C7362Q6u(Context context, IBinder iBinder, C62320sa r3) {
        this.A00 = context;
        this.A01 = iBinder;
        this.A02 = r3;
    }
}
