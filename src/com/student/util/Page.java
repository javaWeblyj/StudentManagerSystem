package com.student.util;

//实现数据分页管理
public class Page {
	// 开始页
	int start = 0;
	// 每页记录数
	int count = 5;
	// 最后一页
	int last = 0;
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}
	
	// 通过总数和每一页的个数算出最后一页位置
	public void calculateLast(int total) {
		// 假设总数是 50，是能被整 5 整除的，那么最后一页的开始就是 45
		if(0 == total % count) {
			last = total - count;
		// 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
		} else {
			last = total - total % count;
		}
	}
}
