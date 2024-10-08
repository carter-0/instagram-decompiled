package X;

import com.facebook.react.LazyReactPackage;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactMarker;
import com.google.common.collect.LinkedHashMultimap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class TMZ implements Iterator {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;
    public final Object A04;

    public TMZ(LazyReactPackage lazyReactPackage, List list, Map map) {
        this.A01 = lazyReactPackage;
        this.A04 = list;
        this.A02 = map;
        this.A00 = 0;
    }

    public final boolean hasNext() {
        if (this.A03 != 0) {
            R1I r1i = (R1I) this.A04;
            if (r1i.A00 != this.A00) {
                throw new ConcurrentModificationException();
            } else if (this.A01 != r1i) {
                return true;
            } else {
                return false;
            }
        } else if (this.A00 < ((List) this.A04).size()) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.A03 == 0) {
            int i = this.A00;
            this.A00 = i + 1;
            SNI sni = (SNI) ((List) this.A04).get(i);
            String str = sni.A00;
            SFW sfw = (SFW) ((Map) this.A02).get(str);
            if (sfw != null) {
                return new ModuleHolder(sfw, sni.A01);
            }
            ReactMarker.logMarker(RH1.A0N, str, 0);
            try {
                NativeModule nativeModule = (NativeModule) sni.A01.get();
                ReactMarker.logMarker(RH1.A0M);
                return new ModuleHolder(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(RH1.A0M);
                throw th;
            }
        } else if (hasNext()) {
            LinkedHashMultimap.ValueEntry valueEntry = (LinkedHashMultimap.ValueEntry) ((C13787Th2) this.A01);
            Object value = valueEntry.getValue();
            this.A02 = valueEntry;
            C13787Th2 th2 = valueEntry.successorInValueSet;
            th2.getClass();
            this.A01 = th2;
            return value;
        } else {
            throw Pxe.A1C();
        }
    }

    public final void remove() {
        if (this.A03 != 0) {
            R1I r1i = (R1I) this.A04;
            if (r1i.A00 == this.A00) {
                Pxh.A1T(AnonymousClass7TF.A1V(this.A02));
                r1i.remove(((AnonymousClass42Q) this.A02).getValue());
                this.A00 = r1i.A00;
                this.A02 = null;
                return;
            }
            throw new ConcurrentModificationException();
        }
        throw AnonymousClass7TE.A1B("Cannot remove native modules from the list");
    }

    public TMZ(R1I r1i) {
        this.A04 = r1i;
        this.A01 = r1i.A02;
        this.A00 = r1i.A00;
    }
}
