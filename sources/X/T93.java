package X;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;

public final class T93 implements Externalizable {
    public int A00 = 0;
    public T91 A01 = null;
    public T91 A02 = null;
    public T91 A03 = null;
    public T91 A04 = null;
    public T91 A05 = null;
    public T91 A06 = null;
    public T91 A07 = null;
    public T91 A08 = null;
    public T91 A09 = null;
    public T91 A0A = null;
    public T91 A0B = null;
    public T91 A0C = null;
    public T91 A0D = null;
    public T91 A0E = null;
    public T91 A0F = null;
    public T91 A0G = null;
    public String A0H = "";
    public String A0I = "";
    public String A0J = "";
    public String A0K = "";
    public String A0L = "";
    public String A0M = "";
    public String A0N = "";
    public String A0O = "";
    public List A0P = AnonymousClass7TE.A1C();
    public List A0Q = AnonymousClass7TE.A1C();
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n = false;
    public boolean A0o = false;
    public boolean A0p = false;
    public boolean A0q = false;

    public static T91 A00(ObjectInput objectInput) {
        T91 t91 = new T91();
        t91.readExternal(objectInput);
        return t91;
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.A0U);
        if (this.A0U) {
            this.A04.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0T);
        if (this.A0T) {
            this.A03.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0W);
        if (this.A0W) {
            this.A05.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0j);
        if (this.A0j) {
            this.A0D.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0f);
        if (this.A0f) {
            this.A09.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0g);
        if (this.A0g) {
            this.A0A.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0c);
        if (this.A0c) {
            this.A08.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0m);
        if (this.A0m) {
            this.A0G.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0b);
        if (this.A0b) {
            this.A07.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0k);
        if (this.A0k) {
            this.A0E.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0S);
        if (this.A0S) {
            this.A02.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0l);
        if (this.A0l) {
            this.A0F.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0h);
        if (this.A0h) {
            this.A0B.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0i);
        if (this.A0i) {
            this.A0C.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0R);
        if (this.A0R) {
            this.A01.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0a);
        if (this.A0a) {
            this.A06.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.A0H);
        objectOutput.writeInt(this.A00);
        objectOutput.writeUTF(this.A0I);
        objectOutput.writeBoolean(this.A0e);
        if (this.A0e) {
            objectOutput.writeUTF(this.A0O);
        }
        objectOutput.writeBoolean(this.A0X);
        if (this.A0X) {
            objectOutput.writeUTF(this.A0M);
        }
        objectOutput.writeBoolean(this.A0d);
        if (this.A0d) {
            objectOutput.writeUTF(this.A0N);
        }
        objectOutput.writeBoolean(this.A0Y);
        if (this.A0Y) {
            objectOutput.writeUTF(this.A0K);
        }
        objectOutput.writeBoolean(this.A0Z);
        if (this.A0Z) {
            objectOutput.writeUTF(this.A0L);
        }
        objectOutput.writeBoolean(this.A0q);
        List list = this.A0Q;
        int size = list.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((T92) list.get(i)).writeExternal(objectOutput);
        }
        List list2 = this.A0P;
        int size2 = list2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((T92) list2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.A0o);
        objectOutput.writeBoolean(this.A0V);
        if (this.A0V) {
            objectOutput.writeUTF(this.A0J);
        }
        objectOutput.writeBoolean(this.A0n);
        objectOutput.writeBoolean(this.A0p);
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            T91 A002 = A00(objectInput);
            this.A0U = true;
            this.A04 = A002;
        }
        if (objectInput.readBoolean()) {
            T91 A003 = A00(objectInput);
            this.A0T = true;
            this.A03 = A003;
        }
        if (objectInput.readBoolean()) {
            T91 A004 = A00(objectInput);
            this.A0W = true;
            this.A05 = A004;
        }
        if (objectInput.readBoolean()) {
            T91 A005 = A00(objectInput);
            this.A0j = true;
            this.A0D = A005;
        }
        if (objectInput.readBoolean()) {
            T91 A006 = A00(objectInput);
            this.A0f = true;
            this.A09 = A006;
        }
        if (objectInput.readBoolean()) {
            T91 A007 = A00(objectInput);
            this.A0g = true;
            this.A0A = A007;
        }
        if (objectInput.readBoolean()) {
            T91 A008 = A00(objectInput);
            this.A0c = true;
            this.A08 = A008;
        }
        if (objectInput.readBoolean()) {
            T91 A009 = A00(objectInput);
            this.A0m = true;
            this.A0G = A009;
        }
        if (objectInput.readBoolean()) {
            T91 A0010 = A00(objectInput);
            this.A0b = true;
            this.A07 = A0010;
        }
        if (objectInput.readBoolean()) {
            T91 A0011 = A00(objectInput);
            this.A0k = true;
            this.A0E = A0011;
        }
        if (objectInput.readBoolean()) {
            T91 A0012 = A00(objectInput);
            this.A0S = true;
            this.A02 = A0012;
        }
        if (objectInput.readBoolean()) {
            T91 A0013 = A00(objectInput);
            this.A0l = true;
            this.A0F = A0013;
        }
        if (objectInput.readBoolean()) {
            T91 A0014 = A00(objectInput);
            this.A0h = true;
            this.A0B = A0014;
        }
        if (objectInput.readBoolean()) {
            T91 A0015 = A00(objectInput);
            this.A0i = true;
            this.A0C = A0015;
        }
        if (objectInput.readBoolean()) {
            T91 A0016 = A00(objectInput);
            this.A0R = true;
            this.A01 = A0016;
        }
        if (objectInput.readBoolean()) {
            T91 A0017 = A00(objectInput);
            this.A0a = true;
            this.A06 = A0017;
        }
        this.A0H = objectInput.readUTF();
        this.A00 = objectInput.readInt();
        this.A0I = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.A0e = true;
            this.A0O = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.A0X = true;
            this.A0M = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.A0d = true;
            this.A0N = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.A0Y = true;
            this.A0K = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.A0Z = true;
            this.A0L = readUTF5;
        }
        this.A0q = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            T92 t92 = new T92();
            t92.readExternal(objectInput);
            this.A0Q.add(t92);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            T92 t922 = new T92();
            t922.readExternal(objectInput);
            this.A0P.add(t922);
        }
        this.A0o = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.A0V = true;
            this.A0J = readUTF6;
        }
        this.A0n = objectInput.readBoolean();
        this.A0p = objectInput.readBoolean();
    }
}
