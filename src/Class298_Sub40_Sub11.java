/* Class298_Sub40_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub40_Sub11 extends Class298_Sub40 {
    int anInt9723;
    Class160 aClass160_9724;

    Class298_Sub40_Sub11(Class160 class160) {
	super();
	((Class298_Sub40_Sub11) this).aClass160_9724 = class160;
	((Class298_Sub40_Sub11) this).anInt9723 = 977594491;
    }

    void method3508(RsByteBuffer class298_sub53, int i) {
	try {
	    ((Class298_Sub40_Sub11) this).anInt9723 = class298_sub53.readUnsignedShort() * -977594491;
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("agr.a(").append(')').toString());
	}
    }

    void method3511(ClanSettings class162) {
	class162.deleteBannedMember((-142522035 * ((Class298_Sub40_Sub11) this).anInt9723));
    }

    void method3510(ClanSettings class162, byte i) {
	try {
	    class162.deleteBannedMember((-142522035 * ((Class298_Sub40_Sub11) this).anInt9723));
	}
	catch (RuntimeException runtimeexception) {
	    throw Class346.method4175(runtimeexception, new StringBuilder().append("agr.f(").append(')').toString());
	}
    }

    void method3512(RsByteBuffer class298_sub53) {
	((Class298_Sub40_Sub11) this).anInt9723 = class298_sub53.readUnsignedShort() * -977594491;
    }

    void method3509(RsByteBuffer class298_sub53) {
	((Class298_Sub40_Sub11) this).anInt9723 = class298_sub53.readUnsignedShort() * -977594491;
    }
}
