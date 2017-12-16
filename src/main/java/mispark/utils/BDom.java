package mispark.utils;

import java.io.Serializable;
import java.util.HashSet;

import javax.persistence.Table;

public class BDom implements Serializable{
	HashSet<Table> table=new HashSet<Table>();
}
