package com.example.MyHomeTask;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController1 {

	@GetMapping(value="/getFl/{d}")
	public List<Mobile> getB(@RequestBody List<Mobile> c,@PathVariable String d) {
		return c.stream().filter(x->x.getBrand().equals(d)).collect(Collectors.toList());
	}
	 @GetMapping("/getMap") 
	 public List<String> getBrand(@RequestBody List<Mobile> m) {
		 return  m.stream().map(x-> x.getBrand()).collect(Collectors.toList());
	 }
	 
	 @GetMapping(value = "/getC") 
		 public List<Integer> getc(@RequestBody List<Mobile> m) {
			 return m.stream().map(y-> y.getId())
					 .collect(Collectors.toList());
		 }
	 @GetMapping(value = "/getCount")
	 public long getCount(@RequestBody List<Mobile> m) {
		 return m.stream().count();
	 }
	 
	 @GetMapping(value = "/getMax")
	 public int getMax(@RequestBody List<Mobile> m) {
		 return m.stream().map(x-> x.getPrice()).max(Comparable::compareTo).get();
	 }
	 
	 @GetMapping(value = "/getMin")
	 public int getMin(@RequestBody List<Mobile> m) {
		 return m.stream().map(x-> x.getPrice()).min(Comparable::compareTo).get();
	 }
	 
	 @GetMapping(value = "/getMaxObj")
	 public Mobile getMaxObj(@RequestBody List<Mobile> m) {
		 return m.stream().max(Comparator.comparing(Mobile::getPrice)).get();
	 }
	 
	 @GetMapping(value = "/getMinObj")
	 public Mobile getMinObj(@RequestBody List<Mobile> m) {
		 return m.stream().min(Comparator.comparing(Mobile::getPrice)).get();
	 }
	 
	 @GetMapping(value = "/getSort")
	 public List<Integer> sort(@RequestBody List<Mobile> m) {
		 return m.stream().map(x-> x.getPrice()).sorted().collect(Collectors.toList());
	 }
	 
	 @GetMapping(value = "/getSortRev")
	 public List<Integer> sortrev(@RequestBody List<Mobile> m) {
		 return m.stream().map(x-> x.getPrice()).sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
	 }
	
}
